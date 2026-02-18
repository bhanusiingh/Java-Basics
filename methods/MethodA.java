package methods;

public class MethodA {
    public static void greet(){
         System.out.println("Inside greet");
    }
    public static void display(){
        System.out.println("Inside display");
        greet();
        System.out.println("Exit display");
    }
    public static void main(String[] args) {
        System.out.println("Hi");
        display();
        System.out.println("Hi");


    }
}
