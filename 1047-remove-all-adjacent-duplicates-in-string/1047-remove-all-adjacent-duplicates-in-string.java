class Solution {
    public String removeDuplicates(String s) {
        if (s.length() == 1) {
            return s;
        }
        
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            Character current = Character.valueOf(s.charAt(i));
            if (stack.isEmpty() || !stack.peek().equals(current)) {
                stack.push(current);
            }
            else {
                stack.pop();
            }
        }
        
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop().charValue());
        }
        
        return sb.toString();
        
    }
}