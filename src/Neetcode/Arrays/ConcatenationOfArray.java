package Neetcode.Arrays;

public class ConcatenationOfArray {
    public static int[] getConcatenation(int nums[]) {
        int size = nums.length;
        int ans[] = new int[size * 2];
        for(int i = 0;i < size;i++) {
            ans[i] = nums[i];
            ans[i+size] = nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums [] = {1,2,1};
        int ans[] = getConcatenation(nums);
        for(int i = 0;i < ans.length;i++) {
            System.out.println(ans[i]);
        }
    }
}
