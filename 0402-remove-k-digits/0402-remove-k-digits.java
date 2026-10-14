class Solution {
    public String removeKdigits(String num, int k) {
       StringBuilder stack = new  StringBuilder();
       
       for(int i = 0; i<num.length(); i++){
           char curr =  num.charAt(i);

           // main logic aaegaa
           while( k>0 && stack.length() > 0 && stack.charAt(stack.length() - 1) > curr){
                stack.deleteCharAt(stack.length() - 1);
                k--;
            }

            stack.append(curr);
       }
       
          while(k > 0){
            stack.deleteCharAt(stack.length() - 1);
            k--;
        }
           int i = 0;

        while(i < stack.length() && stack.charAt(i) == '0'){
            i++;
        }

        String ans = stack.substring(i);

        if(ans.length() == 0){
            return "0";
        }

        return ans;
    }
}