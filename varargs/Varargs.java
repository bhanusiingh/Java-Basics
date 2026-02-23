//varags is going to be always a last parameter.
//we can only have one varargs parameter in a method.
//why we need varargs? : - 
//because we can pass any number of arguments to a method without having to overload it for different numbers of parameters.
// It provides flexibility and convenience when we don't know how many arguments will be passed to the method.

package varargs;

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
