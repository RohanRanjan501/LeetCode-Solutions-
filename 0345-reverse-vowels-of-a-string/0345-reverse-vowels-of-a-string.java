class Solution {
    public String reverseVowels(String str) {
        int n=str.length();
        char [] ch=str.toCharArray();

        int start=0,end=n-1;
        while(start<end){
            while(start<end && !isVowel(ch[start])){
                start++;
            }
            while(start<end && !isVowel(ch[end])){
                end--;
            }
                char temp=ch[start];
                ch[start]=ch[end];
                ch[end]=temp;
                start++;
                end--;
        }

        return String.valueOf(ch);
    }
    public boolean isVowel(char chr){
        if(chr=='a' || chr=='e' || chr=='i' || chr=='o' ||chr=='u' 
        || chr=='A' || chr=='E' || chr=='I' || chr=='O' || chr=='U'){
                return true;
            }
            return false;
    }
}