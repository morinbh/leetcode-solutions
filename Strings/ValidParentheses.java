class Solution {
    
    public boolean isValid(String s) {
      
        Stack<Character> stack = new Stack<>();
        boolean valid = true;
        
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false; 
                    char poppedElement = stack.pop();
                    if ((poppedElement == '(' && ch == ')') ||
                        (poppedElement == '{' && ch == '}') ||
                        (poppedElement == '[' && ch == ']')) {
                        continue;
                    } else {
                        valid = false;
                        break;
                    }   
            }
        }
        
        if (stack.isEmpty()) {
            return valid;
        } else {
            return false;
        }

    }
}
