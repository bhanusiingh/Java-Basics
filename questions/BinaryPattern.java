package questions;
public class BinaryPattern {
    public static void main(String[] args) {

        int n = 4; // number of rows

        for (int i = 1; i <= n; i++) {
            int num = (i % 2 == 1) ? 1 : 0; // start with 1 for odd rows, 0 for even

            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num = (num == 1) ? 0 : 1; // toggle between 1 and 0
            }
            System.out.println();
        }
    }
}
