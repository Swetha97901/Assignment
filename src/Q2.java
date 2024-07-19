import java.util.Scanner;

public class Q2 {
    static String printstring1(String s)
    {
        return "Hello "+s+", Welcome to Java World!";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String msg=printstring1(s);
        System.out.println(msg);
    }
}
