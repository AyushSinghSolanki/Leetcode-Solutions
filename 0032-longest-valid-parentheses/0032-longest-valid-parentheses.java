class Solution {
    public int longestValidParentheses(String s) {

        int open = 0;
        int close = 0;
        int maxLength = 0;

        // Left to Right travel krenge 
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                open++;
            } else {
                close++;
            }
                // equal ho jata hai agr too maxlength store krlo close * 2 krke
            if (open == close) {
                maxLength = Math.max(maxLength, 2 * close);
            } 
            else if (close > open) {
                //reset mrdoooo
                open = 0;
                close = 0;
            }
        }

        open = 0;
        close = 0;

        // Right to Left travel krenge ab
        for (int i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) == '(') {
                open++;
            } else {
                close++;
            }

            if (open == close) {
                // equal ho jata hai agr too maxlength store krlo open * 2 krke
                maxLength = Math.max(maxLength, 2 * open);
            } 
            else if (open > close) {

                //reset mrdoooo
                open = 0;
                close = 0;
            }
        }

        return maxLength;
    }
}