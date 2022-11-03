class Solution {
    // SPACE COMP :-> O(N) for hashMap
    // TIME COMP  :-> O(N) for traversing it.
    public int longestPalindrome(String[] words) {
        //len to count the length of longest palindrome !
        int len = 0;
        // Map to store string with it's value of repetions.
        HashMap<String,Integer> map = new HashMap<>();
        //Fill the hashMap, if it is repetead increase it by 1.
        for(String s : words)
            map.put(s,1+ map.getOrDefault(s,0));
        
        boolean found = true;
        
        //Traverse through map
        for(Map.Entry m : map.entrySet()){
            // Take the string and reverse it , search for reverse string in hashmap
            String str = (String)m.getKey();
            String rev = String.valueOf(str.charAt(1)) + String.valueOf(str.charAt(0));
            
            /* System.out.println("str : " + str + " rev : " + rev); */
            
            if(str.charAt(1) != str.charAt(0) && map.containsKey(rev)){
                // Make sure their count is greater than zero.
                if(map.get(str) > 0 && map.get(rev) > 0){
                    // Take the min of count from both words str and rev.
                    int min = Math.min(map.get(str),map.get(rev));
                    // Update the value by subtracting min 
                    map.put(str,map.getOrDefault(str,0) - min);
                    map.put(rev,map.getOrDefault(rev,0) - min);
                    // Increase the length by 4 * min
                    len += 4*min;
                   /* System.out.println("len :"+ len); */
                }
                // If both the characters are same in a string and their count is even 
                //We divide count by 2 so that we can put half half part on both sides and multiply by 4 to increase it corresponding length
            }else if(str.charAt(1) == str.charAt(0)){
                len += (map.get(str)/2) * 4;
                // If count is odd we just wanna use that word once so increase length by 2 only. 
                if(map.get(str)%2 != 0 && found){
                    found = false; len += 2;
                }
                /* System.out.println("len :"+ len); */
                
            }
        }
        //Finally return the ans.
        return len;
    }
}

/*
  * DRY RUN
  // Input : 
     ["lc","cl","lc","cl","gg","gg"]
     
    : ->
        str : gg rev : gg
        len :4
        str : lc rev : cl
        len :12
        str : cl rev : lc
     
  // OUTPUT :
      12
      
      // Input : 
     ["cc","ll","xx"]
     
    : ->
        str : cc rev : cc
        len :2
        str : ll rev : ll
        len :2
        str : xx rev : xx
        len :2
     
  // OUTPUT :
      2
  
*/