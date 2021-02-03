package xyz.lbf.dspt.decorator.iodecorator;



import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author lbf
 * @date 2021/2/3
 */
public class LineInputStreamTest {


    public static void main(String[] args) {
        try {
            InputStream in = new FileInputStream("external-file/test.txt");
            LineInputStream lis = new LineInputStream(in);
            String readLine;
            while ((readLine = lis.readLine()) != null) {
                System.out.println(readLine);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
