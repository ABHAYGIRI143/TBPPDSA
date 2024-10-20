import java.util.*;
class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        int[][] arr = new int[n/3][3];
        Arrays.sort(nums);
        int idx = 0;
        
        for(int i=n-1;i>=2;i=i-3) {
            if(nums[i]- nums[i-2] <= k) {
                arr[idx][2] = nums[i];
                arr[idx][1] = nums[i-1];
                arr[idx][0] = nums[i-2];
                idx++;
            } else {
                return new int[0][0];
            }
        }
        return arr;
    }
}