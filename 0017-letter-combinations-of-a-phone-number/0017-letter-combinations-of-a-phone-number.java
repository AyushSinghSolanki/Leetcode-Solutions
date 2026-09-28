
class Solution {

   static void solve(String digits, int index, String [] mapping, ArrayList<String> result,StringBuilder output   ){
    // sbse phela kaam base case
    if(index >= digits.length()){
        // now if index bda ho jata h length see thats mean output ready h usko result me store krdo
        // and return krdo 
        result.add(output.toString());
        return ;
    }
         
         int value = digits.charAt(index) - '0';
         String mappedString = mapping[value];


         for(int i = 0; i < mappedString.length(); i++ ){ // mappedString ke har letter ko ek-ek karke choose karenge
             output.append(mappedString.charAt(i));   // current letter ko output me add kar diya
              solve(digits, index + 1, mapping, result, output);   // next digit par jaakar uske letters try karenge
              //backtracking -> // jo letter abhi add kiya tha usko hata diya,
              // taaki next letter try kar sake
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