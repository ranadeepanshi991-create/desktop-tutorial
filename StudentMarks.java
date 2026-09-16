import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks of Java: ");
        int java = sc.nextInt();

        System.out.print("Enter marks of DBMS: ");
        int dbms = sc.nextInt();
        System.out.print("Enter marks of Java: ");
        int JAVA = sc.nextInt();

        System.out.print("Enter marks of DBMS: ");
        int DBMS = sc.nextInt();

        System.out.print("Enter marks of DSA: ");
        int dsa = sc.nextInt();

        int total = java + dbms + dsa;
        double percentage = total / 3.0;

        System.out.println("\n--- Student Result ---");
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        sc.close();
    }
}

