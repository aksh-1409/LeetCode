class Solution {
    public int maxDepth(String s) {
        int maxDepth = 0;
        int currentDepth = 0;

        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='('){
            currentDepth++;
            maxDepth = Math.max(maxDepth,currentDepth);
            }
            else if(s.charAt(i)==')')
            currentDepth--;

        i++;
        }

        return maxDepth;
    }
}