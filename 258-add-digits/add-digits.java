class Solution {
    public int addDigits(int n) {
        if(n== 0) return 0;
        if(n<10) return n;
        return addDigits(n/10 + n%10);
    }
}