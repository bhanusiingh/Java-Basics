package wrapper;
public class WrapperClass {
    public static void main(String[] args) {
        int a=10;
        Integer b1=new Integer(a);//boxing
        Integer b2=a;//autoboxing
        Integer b3=Integer.valueOf(a);//boxing using valueOf()
        
        int c1=b1.intValue();//unboxing using intValue()
        int c2=b2;//autounboxing
        
        //what is need of wrapper class
        //1.collection framework
        //what is wrapper class
        //wrapper class is a class that wraps a primitive data type
        //wrapper classes are used to convert primitive data types into objects
        //wrapper classes are used in collection framework
        //wrapper classes are used in autoboxing and unboxing

        // // Primitive data types
        // int primitiveInt = 10;
        // double primitiveDouble = 20.5;
        // boolean primitiveBoolean = true;

        // // Wrapping primitive data types into their corresponding wrapper classes
        // Integer wrappedInt = Integer.valueOf(primitiveInt);
        // Double wrappedDouble = Double.valueOf(primitiveDouble);
        // Boolean wrappedBoolean = Boolean.valueOf(primitiveBoolean);

        // // Displaying the wrapped values
        // System.out.println("Wrapped Integer: " + wrappedInt);
        // System.out.println("Wrapped Double: " + wrappedDouble);
        // System.out.println("Wrapped Boolean: " + wrappedBoolean);

        // // Unwrapping the values back to primitive data types
        // int unwrappedInt = wrappedInt.intValue();
        // double unwrappedDouble = wrappedDouble.doubleValue();
        // boolean unwrappedBoolean = wrappedBoolean.booleanValue();

        // // Displaying the unwrapped values
        // System.out.println("Unwrapped Integer: " + unwrappedInt);
        // System.out.println("Unwrapped Double: " + unwrappedDouble);
        // System.out.println("Unwrapped Boolean: " + unwrappedBoolean);
    }
}