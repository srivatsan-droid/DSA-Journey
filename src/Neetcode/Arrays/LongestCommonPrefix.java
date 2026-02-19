package Neetcode.Arrays;

public class LongestCommonPrefix {
    public static String LongestPrefixBrute(String[] strs) {
        int size = strs.length;
        for(int i = 0 ;i < size;i++) {
            for(int j = i + 1;j < size;j++) {
                String char1 = strs[i].toString();
                String char2 = strs[j].toString();
                if(char1 == char2) {
                    return strs[j];
                }
            }
        }
        return new String("");
    }
    public static void main(String[] args) {
        String strs[] = {"flower","flow","flight"};
        String ans = LongestPrefixBrute(strs);
        System.out.println(ans);
    }
}
