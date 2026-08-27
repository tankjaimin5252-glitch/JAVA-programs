import java.util.Scanner;
public class Bank_Project {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String accountHolder = "Account Holder";
        double balance = 500.00;
        int choice;

        System.out.println("*****Welcome To the Bank*****");
        System.out.println("                              ");

        do{
            System.out.println("*************************");
            System.out.println("1.Check Your Balance");
            System.out.println("2.Deposite");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");

            System.out.print("Choose an Option (1-4) :");
            choice = sc.nextInt();
            System.out.println("                              ");

            if (choice==1) {
                System.out.println("Account Holder :"+ accountHolder);
                System.out.println("Balance ="+ balance);
            }
            else if (choice==2) {
                System.out.println("Enter Deposite Value :");
                double amount = sc.nextDouble();
                balance = balance + amount;
                System.out.println("Added Deposite is ="+ amount);
            }
            else if (choice==3) {
                System.out.println("Enter Value For Deposite :");
                double amount = sc.nextDouble();

                if (amount<=balance) {
                    balance=balance-amount;
                    System.out.println("Withdrawal Value is ="+amount);

                }
                else{
                    System.out.println("You do not have enough money");
                }
            }
        else if (choice==4) {
                System.out.println("Thank you for using the bank");
            }
        else{
            System.out.println("Invalid Option. Please Try again.");
        }
        }while(choice !=4);
        sc.close();
    }
}
