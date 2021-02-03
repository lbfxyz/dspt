package xyz.lbf.dspt.decorator.iodecorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author lbf
 * @date 2021/2/3
 */
public class LowerCaseInputStreamTest {

    public static void main(String[] args) {
        try {
            InputStream in = new FileInputStream("external-file/test.txt");
            LowerCaseInputStream lowerCaseInputStream = new LowerCaseInputStream(in);
            byte[] bytes = new byte[1024];
            int byteRead;
            while ((byteRead = lowerCaseInputStream.read(bytes)) != -1) {
                System.out.println(new String(bytes, 0, byteRead));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
