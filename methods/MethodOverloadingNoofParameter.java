// Method overloading - multiple methods with same name but different parameters.
//Done via 
//1. No. of parameters
//2. Type of parameters
//3. Sequence of parameters





// [ TYPE 1 - No. of parameters ]
package methods;


public class MethodOverloadingNoofParameter {

    public int sum(int a, int b){
        return a+b;
    }
    public int sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        MethodOverloadingNoofParameter obj= new MethodOverloadingNoofParameter();
        int answer =obj.sum(2, 5);
        System.out.println("Sum of a and b is: " + answer);
        int answer2 =obj.sum(2, 5, 10);
        System.out.println("Sum of a, b and c is: " + answer2);
    }

    // public static void add(int a, int b){
    //     System.out.println("Inside add with 2 parameters");
    //     System.out.println("Sum: " + (a+b));
    // }
    // public static void add(int a, int b, int c){
    //     System.out.println("Inside add with 3 parameters");
    //     System.out.println("Sum: " + (a+b+c));
    // }
    // public static void add(double a, double b){
    //     System.out.println("Inside add with double parameters");
    //     System.out.println("Sum: " + (a+b));
    // }
    // public static void main(String[] args) {
    //     add(10, 20);
    //     add(10, 20, 30);
    //     add(10.5, 20.5);
    }

