class Solution {
    public String reverseParentheses(String s) {
        
        StringBuilder str = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            
            if(ch == ')'){
                while(stack.peek() != '('){
                    str.append(stack.pop());
                }
                stack.pop();
                while(str.length() != 0){
                    stack.push(str.charAt(0));
                    str.deleteCharAt(0);
                }
            }
            else{
                stack.push(ch);
            }
        }
        while(stack.size()!= 0){
            str.insert(0,stack.pop());
        }
        return str.toString();
    }
}