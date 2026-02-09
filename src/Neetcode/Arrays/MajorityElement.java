package Neetcode.Arrays;

import java.util.HashMap;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        for(int i = 0;i < nums.length;i++) {
            freqMap.put(nums[i],freqMap.getOrDefault(nums[i],0)+1);
        }
        for(int key : freqMap.keySet()) {
            if(freqMap.get(key) > nums.length/2) {
                return key;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,2,1,1,3};
        int ans = majorityElement(nums);
        System.out.println(ans);
    }
}
