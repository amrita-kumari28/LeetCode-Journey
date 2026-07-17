class Solution {
    public int[] gcdValues(int[] nums, long[] queries) {

        int max = 0;
        for (int x : nums)
            max = Math.max(max, x);

        // frequency of every value
        int[] freq = new int[max + 1];
        for (int x : nums)
            freq[x]++;

        // cnt[d] = numbers divisible by d
        int[] cnt = new int[max + 1];

        for (int d = 1; d <= max; d++) {
            for (int multiple = d; multiple <= max; multiple += d) {
                cnt[d] += freq[multiple];
            }
        }

        // exact[d] = pairs whose gcd is exactly d
        long[] exact = new long[max + 1];

        for (int d = max; d >= 1; d--) {

            long total = (long) cnt[d] * (cnt[d] - 1) / 2;

            for (int multiple = d * 2; multiple <= max; multiple += d) {
                total -= exact[multiple];
            }

            exact[d] = total;
        }

        // prefix counts
        long[] prefix = new long[max + 1];

        for (int d = 1; d <= max; d++) {
            prefix[d] = prefix[d - 1] + exact[d];
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            long q = queries[i] + 1; // convert 0-based index to rank

            int l = 1;
            int r = max;

            while (l < r) {
                int mid = (l + r) / 2;

                if (prefix[mid] >= q)
                    r = mid;
                else
                    l = mid + 1;
            }

            ans[i] = l;
        }

        return ans;
    }
}