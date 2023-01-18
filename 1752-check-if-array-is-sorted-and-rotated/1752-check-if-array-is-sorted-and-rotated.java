class Solution {
    public boolean check(int[] nums) {
        
        int i = 0;
        int n = nums.length;
        int flag = 0;
        while(i<n){
            if(nums[i]>nums[(i+1)%n]){
                flag+=1;
            }
            i++;    
            }
        if(flag>1)
            return false;
        return true;   
        }
    }
