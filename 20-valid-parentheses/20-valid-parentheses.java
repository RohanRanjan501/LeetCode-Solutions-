class Solution {
    public static boolean isValid(String s) {
        int size = s.length();
        if ((size & 1) != 0) return false;

        int count = 0;
        char[] chars = new char[size];

        for (char ch : s.toCharArray()) {
            switch (ch) {
                case '(':
                    chars[count++] = ')';
                    continue;

                case '{':
                    chars[count++] = '}';
                    continue;

                case '[':
                    chars[count++] = ']';
                    continue;

                default:
                    if(count == 0 || chars[--count] != ch) return false;
            }
        }
        return count == 0;
    }
}