package Neetcode.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElementII {
    public static List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        //finding the Frequency of the element in the map
        for(int i = 0;i < n;i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int key : map.keySet()) {
            if(map.get(key) > n/3) {
                ans.add(key);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {3,2,3};

        List<Integer> ans = majorityElement(nums);

        for(int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }

}
