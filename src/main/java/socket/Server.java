package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Server {
    private ServerSocket serverSocket;
    //private PrintWriter[] allOut = {};
    private Collection<PrintWriter> allOut = new ArrayList<>();

    public Server() {
        try {
            System.out.println("正在启动服务器......");
            serverSocket = new ServerSocket(8084);
            System.out.println("服务器启动完毕!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }

    public void start() {
        try {
            while (true) {
                System.out.println("等待客户端连接...");
                Socket socket = serverSocket.accept();//阻塞方法
                System.out.println("客户端连接了");
                //启动一个线程负责处理该客户端交互
                ClientHandler handler = new ClientHandler(socket);
                Thread t = new Thread(handler);
                t.start();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 该线程负责与客户端交互
     */
    public class ClientHandler implements Runnable {

        private Socket socket;
        private String host;//记录当前对应客户端地址

        public ClientHandler(Socket socket) {
            this.socket = socket;
            //通过socket获取远端的计算机ip地址
            host = socket.getInetAddress().getHostAddress();
        }

        @Override
        public void run() {
            PrintWriter pw = null;
            try {
                InputStream in = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(in, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);

                //用socket将消息发送给客户端
                OutputStream out = socket.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(out, StandardCharsets.UTF_8);
                BufferedWriter bw = new BufferedWriter(osw);
                pw = new PrintWriter(bw, true);

                synchronized (allOut) {
                    //将输出流存入到共享数组allOut
                    allOut.add(pw);
                }
                sendMessage(host + "上线了，当前在线人数：" + allOut.size());

                String line;
                while ((line = br.readLine()) != null) {
                    sendMessage(
                            host + "说：" + "\t" + line
                    );

                }
            } catch (IOException e) {
                //e.printStackTrace();
            } finally {
                //处理客户端断开连接后的操作
                synchronized (allOut) {
                   allOut.remove(pw);
                }
                sendMessage(host+"下线了，当前在线人数："+allOut.size());
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }

        private  void  sendMessage(String message){
            System.out.println(message);
            synchronized (Server.this) {
                //将消息发送给所有客户端
                Iterator<PrintWriter> it = allOut.iterator();
                while (it.hasNext()){
                    PrintWriter pw3 = it.next();
                    pw3.println(host + "说：" + "\t" + message);
                }
            }
        }



    }

}
