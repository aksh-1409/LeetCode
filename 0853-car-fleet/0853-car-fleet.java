import java.util.*;

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        List<int[]> cars = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            cars.add(new int[]{position[i], speed[i]});
        }

        Collections.sort(cars, (a, b) -> Integer.compare(b[0],a[0])); // 10,8,5,3,0
        Stack<Double> stack = new Stack<>();

        for( int[] car :cars){
            int carPos = car[0];
            int carSpeed = car[1];

            double time = (double)(target-carPos)/carSpeed;

            if(stack.isEmpty())
            stack.push(time);
            else{
                if(time>stack.peek())
                stack.push(time);
            }
        }

        return stack.size();
    }
}