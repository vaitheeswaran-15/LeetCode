class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, max = 0;
        HashSet<Character> set = new HashSet<>();
        
        for (int j = 0; j < s.length(); j++) {
            while (set.contains(s.charAt(j))) {
                set.remove(s.charAt(i));
                i++; 
            }
            set.add(s.charAt(j));
            max = Math.max(max, j - i + 1);
        }
        return max;
    }
}
