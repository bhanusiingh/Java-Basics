package stringbuilders;

public class Stringbuilder {
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
    }
}