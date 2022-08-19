package Io;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class BRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/yanghongtao/Java/Io//sow.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String line ;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }

    }
}
