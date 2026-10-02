public class MultiplicationTable {
     
    static void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {

        int number = 5;

        printTable(number);
    }
} 

