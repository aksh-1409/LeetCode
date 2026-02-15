import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collection;

class MinStack {
    private ArrayList<HashMap<Integer,Integer>> list = new ArrayList<>();
    public MinStack() {

    }
    
    public void push(int val) {
        if(list.isEmpty()){
            HashMap<Integer,Integer> mp = new HashMap<>();
            mp.put(val,val);
            list.add(mp);
        }else{
            Collection<Integer> col =  list.get(list.size()-1).values();
            Integer prevMin = new ArrayList<Integer>(col).get(0);
          if(prevMin<val){
            HashMap<Integer,Integer> mp = new HashMap<>();
            mp.put(val,prevMin);
            list.add(mp);
          }else{
            HashMap<Integer,Integer> mp = new HashMap<>();
            mp.put(val,val);
            list.add(mp);
          }
        }
 }
    
    public void pop() {
        list.remove(list.size()-1);
    }
    
    public int top() {
    HashMap<Integer, Integer> map = list.get(list.size() - 1);
    return map.keySet().iterator().next();
    }
    
    public int getMin() {
        Collection<Integer> col =  list.get(list.size()-1).values();
        return new ArrayList<Integer>(col).get(0);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */