package Io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/*
    使用转换流读取文本数据
 */
public class ISRDome {
    public static void main(String[] args) throws IOException {
        //将当前源代码取出来并输出到控制台上
        FileInputStream fis = new FileInputStream("/Users/yanghongtao/Java/Io//sow.txt");
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
        int d ;
        while((d = isr.read()) != -1){
            char c = (char) d;
            System.out.print(c);
        }
        isr.close();
    }
}
