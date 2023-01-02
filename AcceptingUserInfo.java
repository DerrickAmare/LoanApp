import java.util.Scanner;

public class AcceptingUserInfo {

     private String name;
    private static int choice;
    int x;
   private Scanner scanner= new Scanner(System.in);
    public  void acceptInfo(){

        char reply;
        System.out.println("Hello, Dear customer Welcome.");
        System.out.println();
        System.out.println("Please Enter your name");
         name=scanner.next();

        System.out.println("Please enter your address? city ");
        String city= scanner.next();


        System.out.println("Please enter your pin code");
        int pin= scanner.nextInt();

         do{
             System.out.println("Welcome back come our "+ name+" What type of loan are you looking for today?");
             System.out.println(" 1. Home");
             System.out.println(" 2. Personal");
             System.out.println(" 3. Educational");
             System.out.println(" 4. Car");
             System.out.println("");
             int choice= scanner.nextInt();
             x =choice;
                options();
             System.out.println(name+", Do you want to go to main menu ? Y to continue or press any key to exit ");
             reply=scanner.next().charAt(0);
         }while (reply=='y'|| reply=='Y');

        System.out.println("Thank you "+name+" for Banking with us!");
    }
     public  void options(){


            switch (x){
                case 1:
                    HomeLoan hl= new HomeLoan();
                    hl.eligibilityTest();
                     break;
                case (2):
                    PersonalLoan pl= new PersonalLoan();
                    pl.eligibilityTest();
                    break;
                case (3):
                    EducationalLoan el= new EducationalLoan();
                    el.eligibilityTest();
                    break;
                case (4):
                    CarLoan cl= new CarLoan();
                    cl.eligibilityTest();
                    break;
                default:
                    System.out.println("Please only choose from the above choices only");

            }



     }

}
