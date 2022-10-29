class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Arrays.sort(nums);
        // return nums[nums.length-k];
    
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int i : nums) {
            if (pq.size() == k && i > pq.peek()) {
                pq.poll();
                pq.add(i);
            } else if (pq.size() < k) {
                pq.add(i);
            }
        }
        
        return pq.peek();
    }
}
