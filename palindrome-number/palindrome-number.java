class Solution {
    public boolean isPalindrome(int x) {
        if (x == 0)               { return true; }
        if (x < 0 || x % 10 == 0) { return false; }
        int result = 0;
        while(result < x) {
            result *= 10;
            result += x % 10;
            x /= 10;
        }
        return (x == result || x == result / 10);
    }
}