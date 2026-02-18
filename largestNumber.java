public class largestNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 15;

        int largest;

        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }

        System.out.println("The largest number is: " + largest);
    }
}