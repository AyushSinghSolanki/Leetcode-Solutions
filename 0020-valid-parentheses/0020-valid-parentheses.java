import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // Closing brackets
            else {

                if (stack.isEmpty()) {
                    return false;
                }

                if (ch == ')' && stack.peek() != '(') {
                    return false;
                }

                if (ch == '}' && stack.peek() != '{') {
                    return false;
                }

                if (ch == ']' && stack.peek() != '[') {
                    return false;
                }

                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}