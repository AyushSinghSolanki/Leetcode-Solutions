import java.util.Stack;

class Solution {
    public int minAddToMakeValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            // Opening bracket -> push
            if (ch == '(') {
                stack.push(ch);
            } 
            else {
                // Matching opening bracket found -> pop
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } 
                else {
                    // No matching '(' -> need one extra '('
                    stack.push(ch);
                }
            }
        }

        // Remaining brackets need to be added
        return stack.size();
    }
}