public class Display {

    static void display(String name) {
        System.out.println("Name: " + name);
    }

    static void display(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        display("Deepanshi");
        display("Deepanshi", 22);
    }
}
