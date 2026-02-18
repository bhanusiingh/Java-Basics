package stringbuilders;

public class InbuiltFunctions {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb.toString()); // Output: Hello World

        sb.insert(5, ",");
        System.out.println(sb.toString()); // Output: Hello, World

        sb.delete(5, 6);
        System.out.println(sb.toString()); // Output: Hello World

        sb.reverse();
        System.out.println(sb.toString()); // Output: dlroW olleH

        sb.length(); // Returns the length of the string
        System.out.println(sb.length()); // Output: 11

        sb.capacity(); // Returns the current capacity of the StringBuilder
        System.out.println(sb.capacity()); // Output: 16 (default capacity)

        sb.setLength(5); // Sets the length of the StringBuilder to 5
        System.out.println(sb.toString()); // Output: dlroW

        sb.substring(0, 3); // Returns a substring from index 0 to 3 (exclusive of 3)
        System.out.println(sb.toString()); // Output: dlroW
        
        sb.charAt(0); // Returns the character at index 0
        System.out.println(sb.charAt(0)); // Output: d 

    }
}
