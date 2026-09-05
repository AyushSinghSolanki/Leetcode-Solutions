
class Solution {

   static void solve(String digits, int index, String [] mapping, ArrayList<String> result,StringBuilder output   ){
    // sbse phela kaam base case
    if(index >= digits.length()){
        result.add(output.toString());
        return ;
    }
         
         int value = digits.charAt(index) - '0';
         String mappedString = mapping[value];


         for(int i = 0; i < mappedString.length(); i++ ){
             output.append(mappedString.charAt(i));
              solve(digits, index + 1, mapping, result, output);
               output.deleteCharAt(output.length() - 1);

         }
   }

    public List<String> letterCombinations(String digits) {
      String [] mapping = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
      ArrayList <String> result = new ArrayList<>();

      if(digits.length() == 0){
            return result;
        }
            solve(digits, 0,  mapping, result, new StringBuilder());
            return result;
    }
}