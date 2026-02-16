package Neetcode.TwoPointers;

public class ReverseString {
    public static void inPlaceReversal(char[] s) {
        int left = 0,right = s.length-1;
        while(left <= right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
    private static void printString(char[] s) {
        for(int i = 0;i < s.length;i++) {
            System.out.println(s[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        inPlaceReversal(s);
        printString(s);
    }
}
