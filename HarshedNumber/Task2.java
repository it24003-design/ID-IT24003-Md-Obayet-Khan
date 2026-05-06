class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int n) {
        int x = 0;
        int n1 = n;

        while (n != 0) {
            x += n % 10;
            n /= 10;
        }

        if (n1 % x == 0)
            return x;
        else
            return -1;
    }
}
