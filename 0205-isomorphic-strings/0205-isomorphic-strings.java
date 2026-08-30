import java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t) {

        Hashtable<Character, Character> ht = new Hashtable<>();

        for (int i = 0; i < s.length(); i++) {

            char sc = s.charAt(i);
            char tc = t.charAt(i);

            if (ht.containsKey(sc)) {

                if (ht.get(sc) != tc) {
                    return false;
                }

            } else {

                if (ht.containsValue(tc)) {
                    return false;
                }

                ht.put(sc, tc);
            }
        }

        return true;
    }
}