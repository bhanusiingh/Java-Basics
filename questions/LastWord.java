// Given string s1 containing collection of words  seprated by space, find the last word in the string.

package questions;

public class LastWord {
    public static String getLastWord(String s1) {
        String[] words = s1.split(" ");
        return words[words.length - 1];
    }

    public static void main(String[] args) {
        String s1 = "Hello There World      "; 
        System.out.println(getLastWord(s1));
    }
}

// public class LastWordNoSplit {
//     public static String getLastWord(String s1) {
//         s1 = s1.trim();  // Remove leading/trailing spaces
//         int lastSpace = s1.lastIndexOf(' ');
//         if (lastSpace == -1) {
//             return s1;
//         }
//         return s1.substring(lastSpace + 1);
//     }

//     public static void main(String[] args) {
//         String s1 = "Hello world from Java  ";
//         System.out.println(getLastWord(s1));  // "Java"
//     }
// }


