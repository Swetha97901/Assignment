import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        String[] days={"Zero ","One ","Two ","Three ",
                "Four ","Five ","Six ","Seven ","Eight ","Nine "};
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rem=0;
        String s="";
        while(n!=0) {
            rem = n % 10;
            n = n / 10;
            s = days[rem]+s;
        }
        System.out.println(s);
    }
}
