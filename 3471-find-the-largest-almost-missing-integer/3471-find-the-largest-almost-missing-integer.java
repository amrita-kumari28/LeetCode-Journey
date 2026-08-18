class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i <= nums.length - k; i++) {

            HashSet<Integer> set = new HashSet<>();

            for (int j = i; j < i + k; j++) {
                set.add(nums[j]);
            }

            for (int x : set) {
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
        }

        int max = -1;

        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                max = Math.max(max, key);
            }
        }

        return max;
    }
}