import java.util.*;
class Solution {
    public void rotate(int[] nums, int k) {
        if(k==nums.length || nums.length==1 || nums==null)
        return;
        if(k>nums.length)
        k=k % nums.length;

        for(int i=0,j=nums.length-k-1;i<j;i++,j--){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;

        }
        for(int i=nums.length-k,j=nums.length-1;i<j;i++,j--){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;

        }
        for(int i=0,j= nums.length-1;i<j;i++,j--){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
System.out.print(Arrays.toString(nums));
    }
}
