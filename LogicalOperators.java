public class LogicalOperators {
    public static void main(String[] args) {

        int age = 22;
        int marks = 75;

        System.out.println("age > 18 && marks >= 50 : " + (age > 18 && marks >= 50));
        System.out.println("age > 18 || marks >= 90 : " + (age > 18 || marks >= 90));
        System.out.println("!(age > 18) : " + !(age > 18));
    }
}