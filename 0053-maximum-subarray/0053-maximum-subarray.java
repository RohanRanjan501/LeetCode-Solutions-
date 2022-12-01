class Solution {
      public int maxSubArray(int[] nums) {
       int sum = 0, max = Integer.MIN_VALUE;
       for(int i = 0; i < nums.length; i++)
       {
           sum = sum < 0? nums[i] : (sum + nums[i]);
           max = Math.max(sum, max);
       }
       return max;
   }
}