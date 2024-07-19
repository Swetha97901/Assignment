package Lab5;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        try {
            int[] a = new int[5];
            a[5]=30/0;
            System.out.println(a[10]);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Exception occurs");
        }
        catch (Exception e)
        {
            System.out.println("General Exception occurs");
        }
    }
}
