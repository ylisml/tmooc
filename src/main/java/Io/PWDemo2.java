package Io;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class PWDemo2 {
    public static void main(String[] args) throws IOException {

    }

    public void flow(String url, boolean tf, String map) throws FileNotFoundException {
        //创建字节流（低级流 文件流）：向文件中写入字节流数据
        FileOutputStream fos = new FileOutputStream(url, tf);//如果希望对文件追加，打开追加模式
        //创建转换流（高级流 字符流）：衔接字节流和字符流，负责将写出的字符转换为字节
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);//若需明确字符集，则应在转换流后添加
        //创建缓冲流（高级流 字符流）：加快文件操作
        BufferedWriter bw = new BufferedWriter(osw);
        //创建PrintWriter流（高级流 字符流）：按行写出字符串，自动刷新行
        PrintWriter pw = new PrintWriter(bw,true);
        pw.println(map);
        System.out.println("写出完毕!");
        pw.close();
    }
}
