class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack();

        for(int i = 0 ; i < asteroids.length ; i++){
            if(asteroids[i] > 0){
                stack.push(asteroids[i]);
            }
            else{
                boolean isAlive = true;
                while(!stack.isEmpty()){
                    int stackTop = stack.peek();
                    if(stackTop < 0){
                        isAlive = true;
                        break;
                    }
                    else if(stackTop + asteroids[i] < 0){ // left going is more powerfull
                        stack.pop();
                        isAlive = true;
                    }

                    else if(stackTop + asteroids[i] > 0){
                        isAlive = false;
                        break;
                    }
                    else{
                        stack.pop();
                        isAlive = false;
                        break;
                    }
                }
                if(isAlive){
                    stack.push(asteroids[i]);
                }
            }
        }
        int n = stack.size();
        int[] result = new int[n];

        for(int i = n - 1 ; i >= 0 ; i--){
            result[i] = stack.pop();
        }
        
        return result;
    }
}