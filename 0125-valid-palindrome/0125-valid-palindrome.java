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

// class Solution {
//     public boolean isPalindrome(String s) {
        
//         s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
//         int start = 0;
//         int end = s.length()-1;
//         while(start<end)
//         {
//             if(s.charAt(start++)!=s.charAt(end--))
//                 return false;
//         }
//         return true;
//     }
// }