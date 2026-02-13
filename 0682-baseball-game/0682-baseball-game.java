import java.util.Stack;
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String operation: operations){
            if(operation.equals("C")){
                if(!stack.isEmpty())
                    stack.pop();
            }else if(operation.equals("D")){
                Integer top = stack.peek();
                stack.push(top*2);    
            }else if(operation.equals("+")){

                Integer top = stack.pop();
                Integer second = stack.pop();

                Integer result = top + second;

                stack.push(second);
                stack.push(top);
                stack.push(result);

            }else{
                Integer number = Integer.parseInt(operation);
                stack.push(number);
            }
        }
        int sum = 0;
        for(Integer next: stack){
            sum += next;
        }
        return sum;
    }
}