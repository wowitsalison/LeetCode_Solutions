class Solution {
    public int fib(int n) {
        int j = 0;
        int k = 1;
        int answer = 0;
        if(n == 1){
            return 1;
        }
        for(int i = 0; i < n - 1; i++){
            answer = j + k;
            j = k;
            k = answer;
        }
        return answer;
    }
}
