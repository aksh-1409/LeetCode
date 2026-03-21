import java.util.Stack;
class Solution {
    public int minSwaps(String s) {
        // Stack<Character> stack = new Stack<>();
        // for(char ch: s.toCharArray()){
        //     if(ch=='[')
        //     stack.push(ch);
        //     else{
        //         if(!stack.isEmpty() && stack.peek()=='[')
        //         stack.pop();
        //         else 
        //         stack.push(ch);
        //     }
        // }

        // int open = stack.size()/2;

        // return (int)(open+1)/2;

        int open=0;
        int close = 0;
        for(char ch: s.toCharArray()){
            if(ch=='[')
            open++;
            else{
                if(open<=0)
                close++;
                else 
                open--;
            }
        }

        return (int)(open+1)/2;

    }
}