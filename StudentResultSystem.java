import java.util.Scanner;
public class StudentResultSystem {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Marks : ");
        int Marks = sc.nextInt();

        System.out.print("Enter Enrollment NO : ");
        long enrollment = sc.nextLong();

        System.out.println();
        System.out.println("================================");
        System.out.println("       Student Result       ");
        System.out.println("================================");
        System.out.println(" Name  : " + name);
        System.out.println(" Marks : " + Marks);
        System.out.println("Enrollment No : " + enrollment);

        sc.close();
        if (Marks>100 || Marks<0) {
            System.out.println("Please enter valid marks");
        }
        else if (Marks>=75) {
            System.out.println("Grade : A++");
        }
        else if (Marks>=60) {
            System.out.println("Grade : A");
        }
        else if (Marks>=35) {
            System.out.println("Grade : B");
        }
        else {
            System.out.println("Grade : F");
            System.out.println("Result : Fail");
        }
        System.out.println("================================");
    }
}

