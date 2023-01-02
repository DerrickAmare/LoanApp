import java.util.Locale;
import java.util.Scanner;

public class CarLoan implements LoanIS {
    private String car;
    private double loan, principal;
    ;
    Scanner scanner = new Scanner(System.in);

    @Override
    public void eligibilityTest() {
        System.out.println("Welcome to Car Loan.");
        double monthlyInterest=.21;
        Scanner scanner = new Scanner(System.in);
        System.out.println("what kind of car are you buying?");
        System.out.println("SUV");
        System.out.println("Hatchback");
        System.out.println("Sedan");
        System.out.println("Minibus");
        car = scanner.next();

        calculateLoan(monthlyInterest);

    }

    @Override
    public void calculateLoan(double monthlyInterest) {
        System.out.println("Please insert how much you are putting in for the " + car);
        principal = scanner.nextDouble();
        loan = monthlyInterest * principal;
        if (car.equalsIgnoreCase("suv")) {
            loan = loan * 10.6;
        } else if (car.equalsIgnoreCase("Hatchback")) {
            loan = loan * 8.1;
        } else if (car.equalsIgnoreCase("sedan")) {
            loan = loan * 7.82;
        } else if (car.equalsIgnoreCase("Minibus")) {
            loan = loan * 9.27;
        }else{
            System.out.println("Wrong input");
            System.exit(0);
        }

        System.out.println("your allowed loan is "+loan);
    }
}