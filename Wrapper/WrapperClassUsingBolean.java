package wrapper;
public class WrapperClassUsingBolean {
    public static void main(String[] args) {
        // Primitive boolean
        boolean primitiveBoolean = true;

        // Wrapping primitive boolean into Boolean wrapper class
        Boolean wrappedBoolean = Boolean.valueOf(primitiveBoolean);

        // Displaying the wrapped value
        System.out.println("Wrapped Boolean: " + wrappedBoolean);

        // Unwrapping the value back to primitive boolean
        boolean unwrappedBoolean = wrappedBoolean.booleanValue();

        // Displaying the unwrapped value
        System.out.println("Unwrapped Boolean: " + unwrappedBoolean);
    }
}