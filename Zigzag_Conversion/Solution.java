class Solution {
    public String convert(String s, int numRows) {
        StringBuilder str = new StringBuilder();

        if(numRows == 1){
            return s;
        }

        for(int i=0; i<numRows; i++){
            int curr = i;
            boolean toggle = true;
            int j = numRows - i + 1;

            int step1 = 2 * (numRows - 1 - i);
            int step2 = 2 * i;

            if (step1 == 0) step1 = step2;
            if (step2 == 0) step2 = step1;
            
            while(curr < s.length()){
                str.append(s.charAt(curr));
                curr += toggle ? step1 : step2;
                toggle = !toggle;
            }
        }
        return str.toString();
    }
}
