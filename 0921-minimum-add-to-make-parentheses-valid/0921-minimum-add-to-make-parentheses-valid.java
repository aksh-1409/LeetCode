class Solution {
    public int minAddToMakeValid(String s) {
        // Stack<Character>stack = new Stack<>();

        // for(int i=0;i<s.length();i++){
        //     char ch = s.charAt(i);
        //     if(ch == '(')
        //     stack.push(ch);
        //     else {
        //         if(!stack.isEmpty() && stack.peek()=='(')
        //         stack.pop();
        //         else 
        //         stack.push(ch);
        //     }
            
        // }
        // return stack.size();


        int open=0;
        int close = 0;
        for(char ch: s.toCharArray()){
            if(ch == '(')
            open++;
            else{
                if(open<=0)
                close++;
                else 
                open--;
            }
        }
        return open+close;
    }


}