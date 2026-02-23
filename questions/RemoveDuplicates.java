// Given a string, which is containing lowercase letters, remove the duplicate characters and return the new string. using frequency array
package questions;

public class RemoveDuplicates {
    public static String removeDuplicates(String s) {
        int[] freq = new int[26];  // For 'a' to 'z'
        StringBuilder result = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            int index = c - 'a';
            if (freq[index] == 0) {
                result.append(c);
                freq[index] = 1;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(removeDuplicates(s));  // "geksfor"
    }
}

    // string s1="a b b c d e e";
    // boolean[] arr=new boolean[26];
    // StringBuilder sb=new StringBuilder();
    // for(int i=0;i<s1.length();i++){
    //    char ch=s1.charAt(i);
    //    if(arr[ch-'a']==false){
    //       sb.append(ch);
    //       arr[ch-'a']=true;
    //    }
    // }
    //  sopln(sb.toString()); 


    // public static String removeDuplicates(String s) {
    //     StringBuilder result = new StringBuilder();
    //     boolean[] seen = new boolean[26]; // Assuming only lowercase letters
        
    //     for (char c : s.toCharArray()) {
    //         if (!seen[c - 'a']) {
    //             seen[c - 'a'] = true;
    //             result.append(c);
    //         }
    //     }
        
    //     return result.toString();
    // }

    // public static void main(String[] args) {
    //     String input = "hello";
    //     System.out.println(removeDuplicates(input)); // "helo"
    // }