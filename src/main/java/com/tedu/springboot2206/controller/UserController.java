package com.tedu.springboot2206.controller;

import com.tedu.springboot2206.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    private static File userDir;//表示保存所有用户信息地方目录users

    static {
        userDir = new File("./users");
        if (!userDir.exists()) {
            userDir.mkdirs();
        }
    }

    @RequestMapping("/userList")
    public void userList(HttpServletRequest request,HttpServletResponse response){
        System.out.println("开始处理动态页面!!!!!!!");

        List<User> userList = new ArrayList<>();
        //获取users目录中所有obj文件
        File[] subs = userDir.listFiles(f->f.getName().endsWith(".obj"));
        //将每个文件都返序列华得到User对象
        for (File file : subs){
            try (
                    FileInputStream fis = new FileInputStream(file);
                    ObjectInputStream ois = new ObjectInputStream(fis);
                    ){
                User user = (User) ois.readObject();
                userList.add(user);
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        System.out.println(userList);


    }

    @RequestMapping("/regUser")
    public void reg(HttpServletRequest request, HttpServletResponse response) {

        System.out.println("开始处理注册!!!!!!!!");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String nickname = request.getParameter("nickname");
        String ageStr = request.getParameter("age");
        System.out.println(username + "," + password + "," + nickname + "," + ageStr);

        if (username == null || username.isEmpty() || password == null || password.isEmpty() || nickname == null || nickname.isEmpty()
                || ageStr == null || ageStr.isEmpty() || ageStr.matches("[0-9]")
        ) {
            try {
                response.sendRedirect("/reg_info_error.html");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return;
        }

        int age = Integer.parseInt(ageStr);
        /**将该注册信息以User对象形式表现并序列化到文件中保存
         *将来所有的保存用户信息的文件都统一放在users目录下，并且保存每个用户的文件的名字格式：用户名。obj
         */
        User user = new User(username, password, nickname, age);
        File file = new File(userDir, username + ".obj");

        //如果该文件存在则说明这是一个重复用户
        if (file.exists()) {
            try {
                response.sendRedirect("/have_user.html");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return;
        }

        try (
                FileOutputStream fos = new FileOutputStream(file);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
        ) {
            oos.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            response.sendRedirect("/reg_success.html");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @RequestMapping("/loginUser")
    public void login(HttpServletRequest request, HttpServletResponse response) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username == null || username.isEmpty() || password == null || password.isEmpty()) {
            try {
                response.sendRedirect("login_info_error.html");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return;
        }

        File file = new File(userDir, username + ".obj");
        if (file.exists()) {
            try (
                    FileInputStream fis = new FileInputStream(file);
                    ObjectInputStream ois = new ObjectInputStream(fis);
            ) {
                User user = (User) ois.readObject();
                if (user.getPassword().equals(password)) {
                    response.sendRedirect("/login_success.html");//登陆成功
                    return;
                }

            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }

        }

        //登陆失败
        try {
            response.sendRedirect("login_fail.html");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
