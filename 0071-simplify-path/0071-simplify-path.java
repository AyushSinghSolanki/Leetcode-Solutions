

class Solution {
    public String simplifyPath(String path) {

        // Stack banaya folders store karne ke liye
        Deque<String> st = new ArrayDeque<>();

        // Path ko "/" ke basis par tod diya
        String[] parts = path.split("/");

        // Har part ko ek-ek karke check karenge
        for (String part : parts) {

            // Empty string ya "." ko ignore kar do
            if (part.isEmpty() || part.equals(".")) {
                continue;
            }

            // ".." ka matlab ek folder peeche jaana
            else if (part.equals("..")) {

                // Stack empty nahi hai toh last folder hata do
                if (!st.isEmpty()) {
                    st.pop();
                }
            }

            // Normal folder hai toh stack mein daal do
            else {
                st.push(part);
            }
        }

        // Final path banane ke liye StringBuilder
        StringBuilder result = new StringBuilder();

        // Stack mein bache folders ko reverse order mein nikalo
        while (!st.isEmpty()) {
            result.insert(0, "/" + st.pop());
        }

        // Agar koi folder nahi bacha toh "/" return karo
        if (result.length() == 0) {
            return "/";
        }

        return result.toString();
    }
}

