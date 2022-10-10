
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        
        for(int i = 0; i < nums1.length; i++){
            set.add(nums1[i]);
        }
        
        for(int i = 0; i < nums2.length; i++){
            if(set.contains(nums2[i])) {
                set2.add(nums2[i]);
            }
        }
        
        int[] list = new int[set2.size()];
        int a = 0;
        for(int num:set2){
            list[a++] = num;
        }
        return list;
        
    }
}