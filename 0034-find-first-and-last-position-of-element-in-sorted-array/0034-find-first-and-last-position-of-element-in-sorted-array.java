class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int [] res = new int [2];
        res[0] = FirstPos(nums,target);
        res[1] = LastPos(nums,target);
        
        return res;
        
    }
    
    public static int FirstPos(int arr[], int target){
        int start = 0;
        int ans = -1;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                ans = mid;
                end = mid-1;
            }else if(arr[mid]<target){
                start = mid+1;
            }else {
                 end = mid-1; 
            }
            }
        
        return ans;
    }
    
    public static int LastPos(int arr[], int target){
        int start = 0;
        int ans = -1;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                ans = mid;
                start = mid+1;
          }else if(arr[mid]<target){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return ans;
    }

}