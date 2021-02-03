package xyz.lbf.dspt.decorator.iodecorator;

import java.io.*;

/**
 * @author lbf
 * @date 2021/2/3
 */
public class BufferedInputStreamTest {


    public static void main(String[] args) {

        try {
            InputStream in = new FileInputStream("external-file/test.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(in);
            byte[] bytes = new byte[1024];
            int byteRead;
            while ((byteRead = bufferedInputStream.read(bytes)) != -1) {
                System.out.println(new String(bytes, 0, byteRead));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
