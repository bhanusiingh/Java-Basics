package string;

public class InbuiltFunctions {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        // Length()
        System.out.println("Length: " + str.length());
        
        // touppercase()
        System.out.println("Uppercase: " + str.toUpperCase());
        
        // tolowercase()
        System.out.println("Lowercase: " + str.toLowerCase());
        
        // contains()
        System.out.println("Contains 'World': " + str.contains("World"));
        
        // Replace()
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));
        
        // substring()
        System.out.println("Substring (0, 5): " + str.substring(0, 5));
        
        // Split()
        String[] parts = str.split(", ");
        System.out.println("Split by ', ': " + java.util.Arrays.toString(parts));

        // Trim whitespace [ trim() ] 
        String strWithSpaces = "   Hello, World!   ";
        System.out.println("Trimmed: '" + strWithSpaces.trim() + "'");

        //join()
        String joined = String.join(" - ", "Hello", "World", "Java");
        System.out.println("Joined string: " + joined);

        //indexOf()
        System.out.println("Index of 'World': " + str.indexOf("World"));

        //lastIndexOf()
        System.out.println("Last index of 'o': " + str.lastIndexOf("o"));

        //startsWith() and endsWith()
        System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));
        System.out.println("Ends with 'World!': " + str.endsWith("World!"));

        //equals() and equalsIgnoreCase()
        String str2 = "hello, world!";
        System.out.println("Equals str2: " + str.equals(str2));
        System.out.println("EqualsIgnoreCase str2: " + str.equalsIgnoreCase(str2));

        //concat()
        String str3 = " Welcome to Java.";
        System.out.println("Concatenated string: " + str.concat(str3));

        //toCharArray()
        char[] charArray = str.toCharArray();
        System.out.println("Character array: " + java.util.Arrays.toString(charArray));

        //compareTo()
        String str4 = "Hello, World!";
        System.out.println("Compare to str4: " + str.compareTo(str4)); // should be 0 since they are equal

        //isEmpty()
        String emptyStr = "";
        System.out.println("Is emptyStr empty? " + emptyStr.isEmpty());


}
