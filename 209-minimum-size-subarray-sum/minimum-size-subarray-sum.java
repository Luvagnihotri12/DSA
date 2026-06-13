class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int minvalue = Integer.MAX_VALUE;
        int sum = 0;
        int n = nums.length;
        for (int r =0; r< n; r++) {
            sum = sum + nums[r];

            while (sum >= target) {
                minvalue = Math.min(minvalue, r - l + 1);
                sum = sum - nums[l];
                l++;
            }
        }
        return minvalue == Integer.MAX_VALUE ? 0: minvalue;
        
    }
}