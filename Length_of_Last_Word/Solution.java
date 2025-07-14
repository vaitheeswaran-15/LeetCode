class Solution {
    public int lengthOfLastWord(String s) {
        s = s.strip();
        int i = s.length() - 1;
        int count = 0;
        if(s.length() == 1){
            return 1;
        }
        while(i >= 0 && s.charAt(i) != ' ' ){
            count ++;
            i--;
        }
        return count;
    }
}
