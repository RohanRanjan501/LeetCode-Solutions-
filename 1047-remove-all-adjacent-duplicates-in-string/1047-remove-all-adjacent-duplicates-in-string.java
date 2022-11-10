class Solution {
    public String removeDuplicates(String s) {
        char[] c = new char[s.length()];
        int i = 0; 
        for(int j = 0; j < s.length(); j++){
            if(i > 0 && c[i - 1] == s.charAt(j)){
                i--;
            }
            else{
                c[i] = s.charAt(j);
                i++;
            }
        }
        return new String(c, 0, i);
        
    }
}