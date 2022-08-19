package Io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/**
 *java IO将按照读写数据的单位划分为字节与字符流
 * java.in.InputStream和OutputStream是所有字符流的超类，是抽象类。
 */
public class OSWDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("/Users/yanghongtao/Java/Io//sow.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        String line = "Super idol的笑容都没你的甜。";
        osw.write(line);
        osw.write("八月正午的阳光都没你耀眼。");
        System.out.println("写出完毕！");
        osw.close();
    }
}
