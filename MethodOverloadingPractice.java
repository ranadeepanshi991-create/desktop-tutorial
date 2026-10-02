public class MethodOverloadingPractice {

    // Add 2 numbers
    static int add(int a, int b) {
        return a + b;
    }

    // Add 3 numbers
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Multiply 2 numbers
    static int multiply(int a, int b) {
        return a * b;
    }

    // Multiply 3 numbers
    static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    // Area of square
    static int area(int side) {
        return side * side;
    }

    // Area of rectangle
    static int area(int length, int width) {
        return length * width;
    }

    public static void main(String[] args) {

        System.out.println("Add 2 numbers = " + add(10, 20));
        System.out.println("Add 3 numbers = " + add(10, 20, 30));

        System.out.println("Multiply 2 numbers = " + multiply(4, 5));
        System.out.println("Multiply 3 numbers = " + multiply(4, 5, 6));

        System.out.println("Square Area = " + area(5));
        System.out.println("Rectangle Area = " + area(8, 5));
    }
}
