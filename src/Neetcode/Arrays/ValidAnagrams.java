package Neetcode.Arrays;

public class ValidAnagrams {
    public static boolean isValid(String s,String t) {
        int count[] = new int[26];
        //Edge Case where If the Length of Two Strings are Not Equal then we need to return false
        if(s.length() != t.length())
            return false;
        for(int i = 0;i < s.length();i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for(int cnt : count) {
            if(cnt != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        boolean ans = isValid(s,t);
        System.out.println(ans);
    }
}

