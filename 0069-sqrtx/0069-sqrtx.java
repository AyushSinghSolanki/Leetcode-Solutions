class Solution {
    public int mySqrt(int x) {
        int ans = -1;
        int st = 1;
        int e =  x;
        
            if(x==0){
                return 0;
            }

        while(st<=e){
             int mid = st +(e-st)/2;

             if(mid  == x/mid){
                return mid;
             }

             else if(mid  > x/mid){
                e = mid-1;
             }
              
               else{
                ans = mid;
                st = mid+1;
             }

        }

        return ans;
    }
}