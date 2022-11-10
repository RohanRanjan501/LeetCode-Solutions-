class Solution {
    public boolean isPalindrome(String s) {
        char[] c = s.toLowerCase().toCharArray();
        int i = 0, j = s.length() - 1;
        while (i < j){
            while (i < j && !Character.isLetterOrDigit(c[i]))
                i++;
            while (i < j && !Character.isLetterOrDigit(c[j]))
                j--;
            if (c[i] != c[j])
                return false;
            i++;
            j--;
        }
        return true;
    }
}