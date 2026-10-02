import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    System.out.println("Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    static void addStudent() {

        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        Student student = new Student(rollNo, name, marks);

        students.add(student);

        System.out.println("Student added successfully!");
    }

    static void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student student : students) {
            student.displayStudent();
            System.out.println("------------------");
        }
    }

    static void searchStudent() {

        System.out.print("Enter Roll No to search: ");
        int rollNo = sc.nextInt();

        for (Student student : student)
        {

            if (student.rollNo == rollNo) {
                student.displayStudent();
                return;
            }
        }

        System.out.println("Student not found.");
    }
}
