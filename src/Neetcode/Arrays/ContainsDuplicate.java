package Neetcode.Arrays;

import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int nums[]) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums) {
            if(!set.contains(i)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,1,2,3};
        boolean ans = containsDuplicate(nums);
        System.out.println("Is there Duplicates in Array : " + ans);
    }
}
