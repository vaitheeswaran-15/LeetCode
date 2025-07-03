class Solution {
public int minimumSubarrayLength(int[] nums, int k) {
int min = Integer.MAX_VALUE;
int i = 0;
int sum = 0;
for (int j = 0; j < nums.length; j++) {
            sum |= nums[j];


while (i <= j && sum >= k) {
                min = Math.min(min, j - i + 1);
                i++;
                sum = 0;
for (int x = i; x <= j; x++) {
                    sum |= nums[x];
                }
            }
        }


return min == Integer.MAX_VALUE ? -1 : min;
    }
}
