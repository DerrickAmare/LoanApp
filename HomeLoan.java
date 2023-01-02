import java.text.NumberFormat;
import java.util.Scanner;

public class HomeLoan implements LoanIS{

            private double principal;
    int creditScore;
    Scanner scanner= new Scanner(System.in);
    @Override
    public void eligibilityTest() {
        System.out.println("Welcome to Home Loan.");
        double monthlyInterest= 0.0149;
        System.out.println("Please insert your credit score");
        creditScore= scanner.nextInt();

        if(creditScore<700){
            System.out.println("Sorry you are not eligible for Home Loan.");
        }else{
            calculateLoan( monthlyInterest);
        }
    }

    @Override
    public void calculateLoan(double monthlyInterest) {

        System.out.println("Please insert how much you are putting in for the house");
        principal= scanner.nextDouble();

         double allowedLoan= principal*creditScore/100;
      NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println("with your credit score you are allowed to borrow "+nf.format(allowedLoan)+" ");

        System.out.println("for how many months payment do you want to structure your loan?");
        int numberOfPayments=scanner.nextInt();

        System.out.println("With that your monthly mortgage will be");



        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        System.out.println(mortgage);

    }



}
