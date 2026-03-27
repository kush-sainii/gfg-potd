import java.util.Stack;

class Solution {
    public static boolean isMatching(char a, char b) {
        return (a == '[' && b == ']')||(a == '{' && b == '}')||(a == '(' && b == ')');
    }
    
    static boolean isBalanced(String s) {

        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c == '[' || c == '{' || c == '(') stack.push(c);
            
            else if (c == ']' || c == '}' || c == ')') {
                if(stack.isEmpty()) {
                    return false;
                }
                
                char top = stack.pop();
                if(!isMatching(top,c)) return false;
                
            }

            
        }
        
        return stack.isEmpty();

        
    }
}