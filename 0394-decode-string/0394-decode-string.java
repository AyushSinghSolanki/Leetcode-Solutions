class Solution {
    public String decodeString(String s) {
        Deque<Integer> countStack = new ArrayDeque<>();
        Deque<StringBuilder> stringStack = new ArrayDeque<>();
        int number = 0;
        StringBuilder curr = new StringBuilder();
        
        for(char ch : s.toCharArray()){
            // case 1 Number handling
            if(Character.isDigit(ch)){
                number = number * 10 +(ch -'0');
            }
            
            //case 2 Starting bracket handling
            else if(ch =='['){
            countStack.push(number);
            stringStack.push(curr);
            number = 0;
            curr = new StringBuilder();

            }

            // case 3 close bracket handling main case
            else if(ch == ']'){
               int repeatCount = countStack.peek();
               countStack.pop();
               StringBuilder prev =  stringStack.pop();

               for(int i =1; i<=repeatCount; i++){
                prev.append(curr);
               }

               curr = prev;
            }
            else{
                curr.append(ch);
            }

        }
           return curr.toString();
    }
}