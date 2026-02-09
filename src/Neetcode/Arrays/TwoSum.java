package Neetcode.Arrays;
import java.util.*;
public class TwoSum {
    public static int[] twoSum(int nums[],int target) {
        int size = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i < size;i++) {
            int diff = target - nums[i];
            if(map.containsKey(diff)) {
                return new int[]{map.get(diff),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target = 9;
        int[] ans = twoSum(nums,target);
        for(int result = 0;result < ans.length;result++) {
            System.out.println(ans[result]);
        }
    }
}
