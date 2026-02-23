package questions;

public class ValidAnagrams {
    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        
        int[] charCount = new int[26]; // Assuming only lowercase letters
        
        for (char c : s1.toCharArray()) {
            charCount[c - 'a']++;
        }
        
        for (char c : s2.toCharArray()) {
            charCount[c - 'a']--;
        }
        
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        System.out.println(areAnagrams(s1, s2)); // true
    }
}
//for(int i=0;i<s1.length();i++){
//    char ch1 = s1.charAt(i);
//    char ch2 = s2.charAt(i);
//    arr[ch1-'a']++;
//    arr[ch2-'a']--;
// }
// for(int i=0;i<arr.length;i++){
//    if(arr[i]!=0){
//      sopln("Not Anagrams");
//        return false;
//    }
// }
// sopln("Anagrams");