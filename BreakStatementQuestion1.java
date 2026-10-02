public class BreakStatementQuestion1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10;) {
            for (int i = 1; i <= 10; i++) {
                if (i == 6) {
                    break;
                }
                System.out.print(i);
            }
        }
    

