// class Solution {
//     public int majorityElement(int[] nums) {
//         HashMap<Integer, Integer> m = new HashMap<>();
        
//         for(int i=0;i<nums.length;i++){
//             if(m.containsKey(nums[i])) 
//                 m.put(nums[i],m.get(nums[i])+1); //if key already exists increasing the value by 1    
//             else m.put(nums[i],1);// if the key dosent exitst then adding the new key in the map with value 1
//         }
//         for(int key:m.keySet()){ // adding all the key in the keyset and traversing to find if the value is >n/2
//             if(m.get(key) > nums.length/2)
//                 return key; 
//         }    
//         return 0;    
//     }
// }


class Solution{
    public int majorityElement(int [] nums){
        int count = 0, ME = 0;
        for(int num:nums){
            if(count==0)
                ME = num;
        
        if(num==ME)
            count++;
        else
            count--;
    }
    return ME;
}
}