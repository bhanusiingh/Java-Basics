package initialblocks;

public class Varargs {
    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3, 4, 5));
    }

    public static int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }
}
