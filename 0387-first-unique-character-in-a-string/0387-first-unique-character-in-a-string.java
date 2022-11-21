class Solution {
    public int firstUniqChar(String s) {
       
        
        HashMap<Character, Integer> m = new HashMap<>();
        int i=0;
        for(char c: s.toCharArray()){
            m.put(c,i);
            i++;
        }
        
        int j=0;
        for(char c: s.toCharArray()){
            if(m.containsKey(c) && j == m.get(c)){
                return j;
            }
            else{
                j++;
                m.remove(c);
            }
        }
        return -1;
    }
}