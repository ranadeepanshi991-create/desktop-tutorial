public class FindLargest {

    static int findLargest(int[] numbers) {
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {

        int[] numbers = { 10, 25, 7, 40, 15 };

        int result = findLargest(numbers);

        System.out.println("Largest = " + result);
    }

}
