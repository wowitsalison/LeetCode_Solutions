class Solution {
    public int reverse(int x) {
        int reversed = 0;
        int y = x;
        while(y != 0){
           reversed = reversed * 10 + (y%10);
           y = y/10;
           if(reversed != (reversed * 10) / 10 && y != 0){
               reversed = 0;
               break;
           }
        }
        if(x > 2147483647 || x < -2147483647 || reversed > 2147483647 || reversed < - 2147483647){
           reversed = 0;
        }
        return reversed;
    }
}
