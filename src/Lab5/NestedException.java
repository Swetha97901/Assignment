package Lab5;

public class NestedException {
    public static void main(String[] args) {
        try
        {
            try {
                int a[]=new int[10];
                a[5]=40/0;
                System.out.println("Exception occurs");
            }
            catch (ArithmeticException e)
            {
                System.out.println(e);
            }
            try{
                int a[]=new int[4];
                a[5]=4;
                System.out.println("Array Exception occurs" );
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
            }
            System.out.println("Exception");
        }
        catch(Exception e)
        {
            System.out.println("Handle the exception");
        }

    }
}
