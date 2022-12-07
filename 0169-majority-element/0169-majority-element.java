class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> m = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(m.containsKey(nums[i])){
                m.put(nums[i],m.get(nums[i])+1);
            }
            else{
                m.put(nums[i],1);
            }
        }
        
        for(int key:m.keySet()){
            if(m.get(key) > nums.length/2){
                return key;
            }
        }
        
        return 0;
        
    }
}