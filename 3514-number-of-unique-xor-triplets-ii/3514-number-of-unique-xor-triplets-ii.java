class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;

        if (n == 1)
            return 1;

        HashSet<Integer> pair = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                pair.add(nums[i] ^ nums[j]);
            }
        }

        BitSet ans = new BitSet();

        for (int x : pair) {
            for (int num : nums) {
                ans.set(x ^ num);
            }
        }

        return ans.cardinality();
    }
}