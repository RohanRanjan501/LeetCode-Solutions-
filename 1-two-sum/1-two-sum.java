class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int cur  = nums[i];
            int diff = target - cur;
            if (map.containsKey(diff)){
                return new int[]{i, map.get(diff)};
            } else {
                map.put(cur, i);
            }
        }
        return null;
    }
}