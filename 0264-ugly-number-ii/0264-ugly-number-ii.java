import java.util.*;

class Solution {
    public int nthUglyNumber(int n) {
        
        Hashtable<Long, Integer> table = new Hashtable<>();
       
        PriorityQueue<Long> pq = new PriorityQueue<>();
        
        
        pq.add(1L);
        table.put(1L, 1);
        
        long ugly = 1;
        
        
        for (int count = 0; count < n; count++) {
            ugly = pq.poll();  // get smallest number
            
           
            long n2 = ugly * 2;
            long n3 = ugly * 3;
            long n5 = ugly * 5;
            
           
            if (!table.containsKey(n2)) {
                table.put(n2, 1);
                pq.add(n2);
            }
            if (!table.containsKey(n3)) {
                table.put(n3, 1);
                pq.add(n3);
            }
            if (!table.containsKey(n5)) {
                table.put(n5, 1);
                pq.add(n5);
            }
        }
        
        return (int) ugly;
    }
}
