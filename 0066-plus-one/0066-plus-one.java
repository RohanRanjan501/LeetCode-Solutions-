class Solution {
    public int[] plusOne(int[] digits) {
        if(digits[digits.length-1]!=9){
            digits[digits.length-1]++;
            return digits;
        }
        int length = digits.length;
        while(length>0 && digits[length-1]==9){
            digits[length-1]=0;
            length--;
        }
        if(length<=0){
            int arr[] = new int[digits.length+1];
            Arrays.fill(arr,0);
            arr[0]=1;
            return arr;
        }else{
            digits[length-1]++;
            return digits;
        }
    }
}