import java.util.Scanner;
public class Student_Result_Management {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("------------Student Result Management-----------");
        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Your Enrollment: ");
        String Enrollment = sc.nextLine();

        System.out.print("Enter Marks For Mathematics (1-100) :");
        double mathematics = sc.nextDouble();

        System.out.print("Enter Marks For Science :");
        double Science = sc.nextDouble();

        System.out.print("Enter Marks For English :");
        double English = sc.nextDouble();

        double totalMarks = mathematics + Science + English;
        double Percentage = (totalMarks/300)*100;

        String status = "Passed";

        if (mathematics<35 || Science<35 || English<35) {
            status = "Failed";
        }
        else{
            status = "Passed";
        }
        String Grade;

        if (status.equals("Failed")) {
            Grade = "F";
        }
        else if (Percentage>=85) {
            Grade = "A+";
        }
        else if (Percentage>=70) {
            Grade = "A";
        }
        else if (Percentage>=50) {
            Grade = "B";
        }
        else{
            Grade = "C";
        }

        System.out.println("==============================");
        System.out.println("           Report Card          ");
        System.out.println("==============================");
        System.out.println("Roll no :" + Enrollment + "  Name :" + name);
        System.out.println("                                      ");
        System.out.println("Subject       Marks       Max Marks");
        System.out.println("                                      ");
        System.out.println("Mathematics :" + mathematics + "/100");
        System.out.println("                                      ");
        System.out.println("Science :" + Science + "/100");
        System.out.println("                                      ");
        System.out.println("English :" + English + "/100");
        System.out.println("                                      ");
        System.out.println("Total Marks :" + totalMarks);
        System.out.println("Percentage :" + Percentage);
        System.out.println("Final Grade :" + Grade);
        System.out.println("Result Status :" + status);

        sc.close();
    }
}
