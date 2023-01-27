class Solution {
    public String removeDuplicateLetters(String s) {
        if(s == null || s.length() == 1)
            return s;
        
        Map<Character, Integer> map = new HashMap();
        
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), i);
        }
        
        Stack<Character> stack = new Stack();
        for(int m = 0; m < s.length(); m++){
            char c = s.charAt(m);
            if(!stack.contains(c)){
                while(!stack.isEmpty() && c < stack.peek() && map.get(stack.peek()) > m)
                    stack.pop();
                
                stack.push(c);
            }
        }
         
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty())
            sb.insert(0, stack.pop());
        
        
        return sb.toString();
    }
}