package Neetcode.Arrays;

public class RemoveElement {
    public static int removeElement(int nums[],int val) {
        int size = nums.length;
        int index = 0;
        for(int i = 0;i < size;i++) {
            if(nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
    public static void printArray(int nums[]) {
        for(int i = 0;i < nums.length;i++) {
            System.out.println(nums[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums[] = {3,2,2,3};
        int val = 3;
        int ans = removeElement(nums,val);
        System.out.println(ans);
        printArray(nums);
    }
}
