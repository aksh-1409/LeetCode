import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
       Stack<Integer> stack = new Stack<>();
       for(int next: asteroids){
        if(stack.isEmpty())
            stack.push(next);
        else{
             if(stack.peek() > 0 && next > 0 || stack.peek() < 0 && next < 0 )
             stack.push(next);
             else if(stack.peek() > 0 && next < 0){
                boolean destroyed = false;
                while(!stack.isEmpty() && (stack.peek() > 0 && next < 0)){
                    if(stack.peek() < (-1*next))
                    stack.pop();
                    else if(stack.peek()>(-1*next)){
                        destroyed = true;
                        break;
                    }
                    else if(stack.peek()==(-1*next)){
                    destroyed = true;
                    stack.pop();
                    break;
                    }
                }
                if(!destroyed)
                stack.push(next);
             }
            else if(stack.peek() < 0 && next > 0)
                stack.push(next);
        }
       }
        int[]result = new int[stack.size()];
        for(int i = stack.size()-1;i>=0;i--)
        result[i] = stack.pop();

        return result;
    }
}