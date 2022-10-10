class Solution {
    public boolean containsDuplicate(int[] nums) {
//         Arrays.sort(nums);
        
//         for(int i = 0;i < nums.length-1; i++){
//             if(nums[i]==nums[i+1]){
//                 return true;
//             }
            
//         }
//         return false;
        
        
    //optimized
        
        
      // Hash Set
   Set<Integer> set = new HashSet<>();
    for(int i=0;i<nums.length;i++){
        if(!set.add(nums[i])){
            return true;
        }
    }
    return false;
}
    
            
            //Hash Map
        
        
//     Map<Integer,Integer> map = new HashMap<>();
//     for(int i=0;i<nums.length;i++){
//         if(map.containsKey(nums[i])){
//             return true;
//         } else{
//             map.put(nums[i],1);
//         }
//     }
//     return false;
// }
    
    
}