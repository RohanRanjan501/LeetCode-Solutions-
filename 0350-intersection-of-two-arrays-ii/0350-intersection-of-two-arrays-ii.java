class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       
//         Arrays.sort(nums1);
//         Arrays.sort(nums2);
        
//          ArrayList<Integer> arr = new ArrayList<>();
        
//         int i = 0, j = 0;      
//         while(i < nums1.length && j < nums2.length){
//             if(nums1[i]==nums2[j]){
//                 arr.add(nums1[i]);
//                 i++;
//                 j++;
                
//             }
//             else if(nums1[i]>nums2[j]){
//                 j++;
//                                       }
//             else
//                 i++;          
//         }  
//         int[] result = new int[arr.size()];
//         for(int a = 0; a < arr.size(); a++){
//             result[a] = arr.get(a);
//         }
//         return result;
//     }
        
        int arr[] = new int[1001];
        int k = 0;
        ArrayList<Integer> list = new ArrayList();
        
        for(int i = 0; i < nums1.length; i++){
            arr[nums1[i]]++;
        }
        
        for(int i = 0; i< nums2.length; i++){
            if(arr[nums2[i]]-- > 0){
                nums1[k++] = nums2[i];
            }
        }
        
        return Arrays.copyOf(nums1,k);
    }
        
       
        
    
    
        
                 
                 
                 
                 
                 
        
        
        
}