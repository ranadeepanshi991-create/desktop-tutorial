public class Multiply {

    static int multiply(int a, int b) {
        return a * b;
    }

    static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {

        int result1 = multiply(4, 5);
        int result2 = multiply(4, 5, 6);

        System.out.println("2 numbers multiplication = " + result1);
        System.out.println("3 numbers multiplication = " + result2);
    }
}


