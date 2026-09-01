class Solution {
    public boolean isPowerOfThree(int n) {
        //base case banate h
        if(n==1){
            return true;
        }

        // invalid casee dekhte h 
        if(n <=0 || n %3 != 0){
            return false;
        }

        return isPowerOfThree(n/3);
    }
}