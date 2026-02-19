package questions;
public class hollowX {
    public static void main(String[] args) {

        int n = 5; // must be odd

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == j || i + j == n - 1) {
                    System.out.print("@ ");
                } else {
                    System.out.print("  "); // space for hollow part
                }
            }
            System.out.println();
        }
    }
}
 
