package string;

public class StringClass {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        
        // Concatenation
        String result = str1 + " " + str2;
        System.out.println("Concatenated String: " + result);
        
        // Using StringBuilder for concatenation
        StringBuilder sb = new StringBuilder();
        sb.append(str1);
        sb.append(" ");
        sb.append(str2);
        System.out.println("StringBuilder Concatenated String: " + sb.toString());
        
        // Comparing strings
        System.out.println("str1 equals str2: " + str1.equals(str2));
        
        // Using String.format
        String formatted = String.format("%s %s!", str1, str2);
        System.out.println("Formatted String: " + formatted);
    }
    
}
