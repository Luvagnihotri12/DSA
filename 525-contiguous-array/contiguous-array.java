class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0, -1);
        int n = nums.length;
        int sum =0, maxSum =0;
        for(int i =0; i< n; i++){
            sum += (nums[i]==0) ? -1 : 1;
            if(map.containsKey(sum))
                maxSum = Math.max(maxSum, i-map.get(sum));
            else map.put(sum, i);
        }
        return maxSum;
    }
}