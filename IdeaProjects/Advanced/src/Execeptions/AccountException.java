package Execeptions;

public class AccountException extends Exception {
    public AccountException(Throwable cause) {
        super(cause);
        System.out.println("hey");
    }
}
