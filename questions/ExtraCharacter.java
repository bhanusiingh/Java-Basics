// Geiven two stribgd , S1 and S2, find the extra character in S2 which is not present in S1.

package questions;

public class ExtraCharacter {
    public static char findExtra(String s1, String s2) {
        char result = 0;
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            result ^= s1.charAt(i);
        }
          
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            result ^= s2.charAt(i);
        }
        return result;
    }
        
    //     int res = 0;
    //     for (char c : s1.toCharArray()) {
    //         res ^= (int) c;
    //     }
    //     for (char c : s2.toCharArray()) {
    //         res ^= (int) c;
    //     }
    //     return (char) res;
    // }

    // public static void main(String[] args) {
    //     String s1 = "abcd";
    //     String s2 = "cbdad";
    //     System.out.println(findExtra(s1, s2));  // d
    }




