class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        int[] stack = new int[n];
        int top = -1;

        for(int asteroid : asteroids){
            boolean alive = true;

            while(alive && asteroid < 0 && top >= 0 && stack[top] > 0){
                if(stack[top] < -asteroid){
                    top--;
                }
                else if(stack[top] == -asteroid){
                    top--;
                    alive = false;
                }
                else{
                    alive = false;
                }
            }
            if(alive){
                stack[++top] = asteroid;
            }
        }

        int[] ans = new int[top + 1];
        for(int i = 0; i <= top; i++){
            ans[i] = stack[i];
        }

        return ans;
    }
}