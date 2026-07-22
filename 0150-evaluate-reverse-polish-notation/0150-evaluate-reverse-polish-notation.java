
class Solution {

    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {

            if (token.equals("+")) {

                int a = stack.pop();
                int b = stack.pop();
                stack.push(b + a);

            } else if (token.equals("-")) {

                int a = stack.pop();
                int b = stack.pop();
                stack.push(b - a);

            } else if (token.equals("*")) {

                int a = stack.pop();
                int b = stack.pop();
                stack.push(b * a);

            } else if (token.equals("/")) {

                int a = stack.pop();
                int b = stack.pop();
                stack.push(b / a);

            } else {

                // Number hai
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.peek();
    }
}