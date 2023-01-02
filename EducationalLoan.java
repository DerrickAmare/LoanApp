import java.util.Scanner;

public class EducationalLoan implements LoanIS{
Scanner scanner= new Scanner(System.in);
    @Override
    public void eligibilityTest() {
        System.out.println("Welcome to Educational Loan.");
        double monthlyInterest=0.94;
        System.out.println("are you enrolled in college? y/n");
        char reply=scanner.next().charAt(0);
        if(reply=='y'||reply=='Y')
            calculateLoan(monthlyInterest);
        else
            System.out.println("sorry to be eligible you need to be enrolled in class.");

    }
    @Override
    public void calculateLoan(double rate) {
        System.out.println("how many classes are you enrolled in?");
        byte classes= scanner.nextByte();

        double loan= classes*rate*12000;
        System.out.println("your total educational loan will be "+loan);


    }
}
