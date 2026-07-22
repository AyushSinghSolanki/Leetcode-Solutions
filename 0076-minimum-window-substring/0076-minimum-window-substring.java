class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }

        int[] need = new int[128];
        int[] window = new int[128];

        for (char c : t.toCharArray()) {
            need[c]++;
        }

        int required = t.length();
        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            window[c]++;

            if (need[c] > 0 && window[c] <= need[c]) {
                required--;
            }

            while (required == 0) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);
                window[leftChar]--;

                if (need[leftChar] > 0 && window[leftChar] < need[leftChar]) {
                    required++;
                }

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}