package javas.basic;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author changle
 * Created on 2019-07-31
 */
public class Streams {
    public static void main(String[] args) throws IOException {
//        bufferedReaderReadLine();
        fileInputStream();
    }

    /**
     * fileInputStream  with bytes[]
     * @throws IOException
     */
    public static void fileInputStream() throws IOException {
        InputStream f = new FileInputStream("/Users/changle/idea-workspace/cookJava/src/main/resource/test.txt");

        byte []bytes = new byte[f.available()];
        f.read(bytes);
        System.out.println(new String(bytes));
        f.close();
    }

    /**
     * bufferedReader 按行读取
     */
    public static void bufferedReaderReadLine() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" 'end' to quit");
        String str;
        do {
            str = reader.readLine();
            System.out.println(str);
        } while (!"end".equals(str));
    }

    /**
     * bufferedReader 按字符读取
     * @throws IOException
     */
    public static void bufferedReaderRead() throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("'q' quit");
        do {
            c = (char) br.read();
            System.out.println(c);
        } while ( c != 'q');
    }
}
