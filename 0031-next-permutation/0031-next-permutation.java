class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while(i >= 0) {
            if(nums[i] < nums[i+1]) {
                int j = nums.length - 1;
                while(j >= 0 && nums[j] <= nums[i]) {
                    j--;
                }
                swap(nums, i, j);
                break;
            }
            i--;
        }
        
        reverse(nums, i + 1);        
    }
    
    private void reverse(int[] arr, int start) {
        int i = start;
        int j = arr.length - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        nums[i] += nums[j];
        nums[j] = nums[i] - nums[j];
        nums[i] = nums[i] - nums[j];
    }
}