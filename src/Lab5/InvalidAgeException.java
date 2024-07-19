package Lab5;
class AgeValidator extends Exception
{
    AgeValidator(String message) {
        super(message);
    }
}
public class InvalidAgeException {
    static void invalidAge(int a) throws AgeValidator {
        throw new AgeValidator("Invalid Age");
    }
    public static void main(String[] args) {
        int a=14;
        try{
            invalidAge(a);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
