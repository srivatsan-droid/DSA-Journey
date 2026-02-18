package Neetcode.Arrays;

public class BestTimeToBuySellStockII {
    public static int maxProfit(int nums[]) {
        int max = 0;
        int start = nums[0];
        for(int i = 1;i < nums.length;i++) {
            if(start < nums[i]) {
                max+= nums[i] - start;
                start = nums[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int nums[] = {7,1,5,3,6,4};
        int ans = maxProfit(nums);
        System.out.println(ans);
    }
}
