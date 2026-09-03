class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0 || strs[0].equals("")) {
            return "";
        }

     
        if (strs.length == 1) {
            return strs[0];
        }

         int count = 0;

        for(int i=0;i<Math.min(strs[0].length(), strs[1].length());i++){
            if(strs[0].charAt(i)==strs[1].charAt(i))
            count++;
            else break;
        }

        if(count == 0){
            return new String("");
        }


        for(int i=1;i<strs.length-1;i++){
            int j=0;
            while(j<strs[i].length() && j<strs[i+1].length() && strs[i].charAt(j)==strs[i+1].charAt(j) && j<count){
                j++;
            }
            count = j;
 
            if(count == 0){
                return new String("");
            }
        }
        String result = strs[0].substring(0, count);
        return result;
    }
}