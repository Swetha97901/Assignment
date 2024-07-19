package Lab5;
class UserDefined extends Exception
{
    UserDefined(String message) {
        super(message);
    }
}
public class UsingThrowAndThrows {
    static void checkNumber(int age)
    {
        if(age<18)
        {
            System.out.println("Invalid Age");
        }
    }

    public static void main(String[] args) {
        int a=5;
        try
        {
            checkNumber(a);
        }
        catch (ArithmeticException E)
        {
            System.out.println(E.getMessage());
        }
    }
}
