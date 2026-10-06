import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
                // Step 1  : bracket ka starting wala part push krdo stack me 
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // ab check krooo jo ending wala part aa rha h vo sack me present h ke nhiiii
            // or uske top se compare krao jo part aa rha h uska closing part top me ke nhii
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

        // agr stack khali hai  mtlb sucessfully all saarii pair presnen the or ye ek valid ans thaaa 

        return stack.isEmpty();
    }
}