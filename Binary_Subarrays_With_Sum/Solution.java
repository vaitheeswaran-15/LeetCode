class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal-1);
    }
    private int atMost(int[] nums, int goal) {
        if (goal < 0) return 0; 
        int i = 0, count = 0, sum = 0;
        
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            
            while (sum > goal) {
                sum -= nums[i++];
            }
            
            count += j - i + 1;
        }
        
        return count;
    }
}
