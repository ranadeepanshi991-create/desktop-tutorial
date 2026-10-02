public class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        Student s1 = new Student("Deepanshi", 22);
        Student s2 = new Student("Rahul", 23);

        System.out.println("Student 1: " + s1.name + ", " + s1.age);
        System.out.println("Student 2: " + s2.name + ", " + s2.age);
    }
}