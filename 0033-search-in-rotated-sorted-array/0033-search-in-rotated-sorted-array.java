class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while(end >= start) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target)
                return mid;
            if(nums[mid] >= nums[start]) {
                //left part is sorted
                if (target >= nums[start] && target < nums[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
            else {
                //right part is sorted
                if(target > nums[mid] && target <= nums[end])
                
                    start= mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1;
    }
}