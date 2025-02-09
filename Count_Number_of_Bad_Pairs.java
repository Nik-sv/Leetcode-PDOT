import java.util.HashMap;

class Solution {
    public long countBadPairs(int[] nums) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        long totalPairs = (long) nums.length * (nums.length - 1) / 2;
        long goodPairs = 0;

        for (int i = 0; i < nums.length; i++) {
            int key = nums[i] - i;
            goodPairs += freqMap.getOrDefault(key, 0);  // Count previously seen keys
            freqMap.put(key, freqMap.getOrDefault(key, 0) + 1); // Update frequency
        }

        return totalPairs - goodPairs;
    }
}
