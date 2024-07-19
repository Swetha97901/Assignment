package Lab5;

public class RuntimeExceptionEx {
    static void ValidInput ( int a){
        if (a < 0) {
            throw new WrongInputException("Input is not valid");
        } else {
            System.out.println(a);
        }
    }

    public static void main (String[]args){
        try {
            ValidInput(-5);
        }
        //  catch (RuntimeException runtimeException) {
        catch (WrongInputException wrongInputException) {
            //    System.out.println(runtimeException.getMessage());
            System.out.println(wrongInputException.getMessage());
        }
    }
}
class WrongInputException  extends RuntimeException{
    WrongInputException(){
        super();
    }

    WrongInputException(String string) {
        super(string);
    }

    WrongInputException(String string, Throwable throwable) {
        super(string, throwable);
    }

    //Constructs a new runtime exception with the specified detail message, cause, suppression enabled or disabled, and writable stack trace enabled or disabled.
    //Params:
    //message – the detail message. cause – the cause.
    // (A null value is permitted, and indicates that the cause is nonexistent or unknown.)
    // enableSuppression – whether or not suppression is enabled or disabled
    // writableStackTrace – whether or not the stack trace should be writable

    WrongInputException(String string, Throwable throwable, boolean enableSuppression, boolean writableStackTrace) {
        super(string, throwable, enableSuppression, writableStackTrace);
    }
    WrongInputException(Throwable throwable){
        super(throwable);
    }
}
