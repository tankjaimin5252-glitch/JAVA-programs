import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=====Calculator=====");
        System.out.println("1. Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.multiplication");
        System.out.println("4.Division");

        System.out.print("Enter Choise (1-4): ");
        int choise = sc.nextInt();

        System.out.print("A: ");
        int A = sc.nextInt();
        
        System.out.print("B: ");
        int B = sc.nextInt();

        switch (choise) {
            case 1:
                System.out.println("Addition is= " +(A+B));
                break;
            case 2:
                System.out.println("Subtraction is= " +(A-B));
                break;
            case 3:
                System.out.println("Multiplication is= " +(A*B));
                break;
            case 4:
                System.out.println("Division is= " +(A/B));
                break;

            default:
                System.out.println("Invalid Choise");
                break;
        }
        sc.close();
    }
}