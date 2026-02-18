package methods;

public class TypeOfParameter {
    public static void add(int a, int b){
        System.out.println("Inside add with int parameters");
        System.out.println("Sum: " + (a+b));
    }
    public static void add(double a, double b){
        System.out.println("Inside add with double parameters");
        System.out.println("Sum: " + (a+b));
    }
    public static void main(String[] args) {
        add(10, 20);
        add(10.5, 20.5);
    }
}
