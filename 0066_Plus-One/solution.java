class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        digits[i]++;
        for(int j = i; j > 0; j--){
            if(digits[j] == 10){
                digits[j] = 0;
                digits[j - 1]++;
            }
        }
        if(digits[0] == 10){
            int[] answer = new int[digits.length + 1];
            digits[0] = 0;
            for(int j = i + 1; j > 0; j--){
                answer[j] = digits[j - 1];
            }
            answer[0] = 1;
            return answer;
        } else {
            return digits;
        }
    }
}
