public class Area {

    static int area(int side) {
        return side * side;
    }

    static int area(int length, int width) {
        return length * width;
    }

    public static void main(String[] args) {

        int square = area(5);
        int rectangle = area(8, 5);

        System.out.println("Square Area = " + square);
        System.out.println("Rectangle Area = " + rectangle);
    }
}
