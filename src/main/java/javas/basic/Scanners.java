package javas.basic;

import java.util.Scanner;

/**
 * @author changle
 * Created on 2019-07-31
 */
public class Scanners {
    public static void main(String []args) {
//        scannerNext();
//        scannerNextLine();
        scannerNextX();
    }

    /**
     * scanner  next 接收方式
     * input : test scanner
     * output: test
     *
     * 特点：
     *      必须要读取到有效字符后才可以结束输入
     *      对输入有效字符前的空白，next()方法会自动将其去掉
     *      只有输入有效字符后，才会将后面输入的空白作为分隔符活着结束符
     *      next()函数得不到待空格的字符串
     */
    public static void scannerNext() {
        Scanner scan = new Scanner(System.in);

        System.out.println("next 接收方式");
        if (scan.hasNext()) {
            System.out.println("输入数据为： " + scan.next());
        }
        scan.close();
    }

    /**
     * scanner nextLine 接收方式
     * input : test scanner
     * output: test scanner
     *
     * 特点：
     *      以enter为结束符
     *      可以接收空白字符
     */
    public static void scannerNextLine() {
        Scanner scan = new Scanner(System.in);
        System.out.println("nextLine 接收方式:");
        if (scan.hasNextLine()) {
            System.out.println("input: " + scan.nextLine());
        }
        scan.close();
    }


    public static void scannerNextX() {
        Scanner scan = new Scanner(System.in);

        System.out.println("next int");
        if (scan.hasNextInt()) {
            System.out.println("input: " + scan.nextInt());
        }
        System.out.println("next double");
        if (scan.hasNextDouble()) {
            System.out.println("input: " + scan.nextDouble());
        }
        scan.close();
    }
}
