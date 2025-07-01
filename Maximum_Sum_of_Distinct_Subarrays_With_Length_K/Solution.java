class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long mx=Long.MIN_VALUE, sum=0;
        int i=0, j=0;
        while( j < nums.length){
            sum = sum + nums[j];
            if( j - i + 1 == k){
                mx = Math.max(sum, mx);
                sum-=nums[i];
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return mx;
    }
}
