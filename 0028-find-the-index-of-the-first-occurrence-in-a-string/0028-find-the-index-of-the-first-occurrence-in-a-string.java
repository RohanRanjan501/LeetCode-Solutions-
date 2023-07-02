class Solution {
    public int strStr(String haystack, String needle) {
        // return haystack.indexOf(needle);
        
                if (needle.isEmpty())
            return 0;

        int[] lps = computeLPS(needle);
        int i = 0, j = 0;

        while (i < haystack.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
                if (j == needle.length())
                    return i - j; // Found the needle, return the starting index
            } else if (j > 0)
                j = lps[j - 1];
            else
                i++;
        }

        return -1; // Needle not found in haystack
    }

    private int[] computeLPS(String needle) {
        int[] lps = new int[needle.length()];
        int len = 0, i = 1;

        while (i < needle.length()) {
            if (needle.charAt(i) == needle.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0)
                    len = lps[len - 1];
                else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }
}