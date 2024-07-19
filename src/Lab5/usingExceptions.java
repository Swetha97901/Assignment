package Lab5;

public class usingExceptions {
    public static void main(String[] args) {
        try {
            int a=5/0;
            System.out.println("The divisor is Zero" + a);
        }
        catch (ArithmeticException b)
        {
            System.out.println("Exception Found"+b);
        }
        finally
        {
            System.out.println("Whatever happens the finally is executed");
        }
    }
}
