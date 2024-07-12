class Solution {
    public int maximumGain(String s, int x, int y) {
        if( x > y){
            return Helper(s, x , y , 'a' , 'b');
        }
        return Helper(s , y , x , 'b' , 'a');
    }

    int Helper(String s , int x , int y , char first , char second){
        int max = 0;
        Stack <Character> stack = new Stack<>();
        
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(!stack.isEmpty() && ch == second && stack.peek() == first){
                stack.pop();
                max += x;
            }
            else{
                stack.push(ch);
            }
        }

        StringBuilder stringRemaining = new StringBuilder();
        while(!stack.isEmpty()){
            stringRemaining.insert(0 , stack.pop());
        }

        for(int i = 0 ; i < stringRemaining.length() ; i++){
            char ch = stringRemaining.charAt(i);
            if(!stack.isEmpty() && ch == first && stack.peek() == second){
                stack.pop();
                max += y;
            }
            else{
                stack.push(ch);
            }
        }
        return max;
    }
}