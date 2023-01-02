import java.util.Scanner;

public class PersonalLoan implements LoanIS{

    private double rate,loan,income;
 private  Scanner scanner= new Scanner(System.in);

    @Override
    public void eligibilityTest() {
        System.out.println("Welcome to Personal Loan.");
        System.out.println("Whats your yearly income?");
         income  = scanner.nextDouble();
            if(income >50000) {
                if (income < 100000)
                    rate = 0.78;
                else if (income > 100000 && income < 200000)
                    rate = 0.48;
                else if (income > 200000)
                    rate = 0.14;

                calculateLoan(rate);
            }else {
            System.out.println("Sorry with your current income your not allowed to take personal loans");
        }

    }
    @Override
    public void calculateLoan(double rate) {
         loan=income*rate*0.27;
        System.out.println("your total personal loan will be "+loan);

}
}