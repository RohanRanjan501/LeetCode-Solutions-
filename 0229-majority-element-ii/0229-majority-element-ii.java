class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> m = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(m.containsKey(nums[i])) 
                m.put(nums[i],m.get(nums[i])+1); //if key already exists increasing the value by 1    
            else m.put(nums[i],1);// if the key dosent exitst then adding the new key in the map with value 1
        }
        List<Integer> list = new ArrayList<>();
        for(int key:m.keySet()){ // adding all the key in the keyset and traversing to find if the value is > n/3
            if(m.get(key) > nums.length/3)
              list.add(key);
        }    
        return list;    
    }
}
