import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k < 1 || nums.length < 2) return false;

        Map<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer lastSeenIndex = indexMap.put(nums[i], i);

            if (lastSeenIndex != null && i - lastSeenIndex <= k) return true;
        }

        return false;
    }
}