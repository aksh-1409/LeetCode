import java.util.*;

class Solution {
    public int firstMissingPositive(int[] nums) {
        if (nums.length == 0) return 1;

        TreeSet<Integer> set = new TreeSet<>();
        for (int num : nums) {
            if (num > 0) set.add(num);
        }

        if (set.isEmpty()) return 1;

        List<Integer> list = new ArrayList<>(set);

        if (list.get(0) != 1) return 1;

        for (int i = 0; i < list.size() - 1; i++) {
            int first = list.get(i);
            int second = list.get(i + 1);
            if (second - first > 1) {
                return first + 1;
            }
        }

        return list.get(list.size() - 1) + 1;
    }
}
