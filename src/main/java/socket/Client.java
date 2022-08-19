package socket;

import 语言基础.ScannerDemo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client {
    private Socket socket;//套接字

    public Client() {
        try {
            System.out.println("正在连接服务器......");
            socket = new Socket("localhost", 8084);
            System.out.println("服务器连接成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }

    public void start() {
        //将读取来自服务度消息的线程启动起来
        ServerHandler serverHandler = new ServerHandler();
        Thread t = new Thread(serverHandler);
        t.setDaemon(true);
        t.start();


        try {
            OutputStream out = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(out, StandardCharsets.UTF_8);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw, true);

            InputStream in = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(in);
            BufferedReader br = new BufferedReader(isr);


            Scanner scan = new Scanner(System.in);
            while (true) {
                String line = scan.nextLine();
                if ("exit".equals(line)) {
                    break;
                }
                pw.println(line);
                line = br.readLine();
                System.out.println(line);
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private class ServerHandler implements Runnable {
        public void run() {
            try {
                InputStream in = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(in,StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);

                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }

}
