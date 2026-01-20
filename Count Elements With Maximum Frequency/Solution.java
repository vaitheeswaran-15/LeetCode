class Solution {
    public int maxFrequencyElements(int[] nums) {
        int maxFreq = 0;
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        for(int freq: map.values()){
            maxFreq = Math.max(freq, maxFreq);
        }

        int result = 0;

        for(int freq : map.values()){

            if(freq == maxFreq){
                result += freq;
            }
        }

        return result;
    }
}
