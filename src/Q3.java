import java.util.*;
public class Q3 {
    static void largestof3(int a,int b,int c)
    {
        if(a>b && a>c)
            System.out.println("A is the largest number");
        else if(b>c && b>a)
            System.out.println("B is the largest number");
        else
            System.out.println("C is the largest number");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        largestof3(a,b,c);
    }
}
