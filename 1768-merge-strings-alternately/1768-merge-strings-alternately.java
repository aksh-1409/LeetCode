class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        int i = 0;
        int j = 0;

        StringBuilder result = new StringBuilder();
        
        while(i<word1.length() && j<word2.length()){
            char ch1 = word1.charAt(i);
            char ch2 = word2.charAt(j);

            result.append(ch1);
            result.append(ch2);

            i++;
            j++;
        }

        while(i<word1.length()){
            char ch1 = word1.charAt(i);
            result.append(ch1);
            i++;
        }

        while(j<word2.length()){
            char ch2 = word2.charAt(j);
            result.append(ch2);
            j++;
        }

        return result.toString();
    }
}