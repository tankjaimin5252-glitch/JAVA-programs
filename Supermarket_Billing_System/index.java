import java.util.Scanner;
public class Supermarket_Billing_System{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String item1 = "Milk"; double price1 = 40.00;
        String item2 = "Bread"; double price2 = 30.00;
        String item3 = "Banana"; double price3 = 60.00;

        int qty1 = 0, qty2 = 0,qty3 = 0;
        int choice;

        System.out.println("Welcome to Supermarket Biling System");

        do{
            System.out.println("-----Available Items-----");
            System.out.println("1. " + item1 + "- ₹" + price1);
            System.out.println("2. " + item2 + "- ₹" + price2);
            System.out.println("3. " + item3 + "- ₹" + price3);
            System.out.println("4. Finish Shoping & Genrate Bill");
            System.out.print("Choose item to add cart (1-4) :");

            choice = sc.nextInt();
            
            if (choice==1) {
                System.out.print("Enter quntity for "+ item1 + ": ");
                qty1 += sc.nextInt();
                System.out.println("Added to cart!");
            }
            else if (choice==2) {
                System.out.print("Enter quntity for "+ item2+ ": ");
                qty2 += sc.nextInt();
                System.out.println("Added to cart!");
            }
            else if (choice==3) {
                System.out.print("Enter quntity for "+ item3+ ": ");
                qty3 += sc.nextInt();
                System.out.println("Added to cart!");
            }
            else if (choice !=4) {
                System.out.println("Invaild Choice! Please Select 1-4.");
            }

        }while(choice !=4);
        double total1 = qty1*price1;
        double total2 = qty2*price2;
        double total3 = qty3*price3;

        double subtotal = total1+total2+total3;
        double tax = subtotal*0.05;
        double finalbill = subtotal + tax;

        System.out.println("===============================");
        System.out.println("       FINAL RECEIPT      ");
        System.out.println("===============================");
        System.out.println("Item    |Qty |Price  |Total    ");

        if (qty1>0) System.out.printf(item1,qty1,price1,total1);
        if (qty2>0) System.out.printf(item2,qty2,price2,total2);
        if (qty3>0) System.out.printf(item3,qty3,price3,total3);

        System.out.println("------------------------------");
        System.out.printf("subtotal:  ₹%.2f\n", subtotal);
        System.out.printf("Tax (5%%): ₹%.2f\n", tax);
        System.out.println("------------------------------");
        System.out.printf("TOTAL DUE: ₹%.2f\n", finalbill);
        System.out.println("=================================");
        System.out.println("     Thank you for shoping!       ");

        sc.close();
    }
}
