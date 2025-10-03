class Solution {
    static long MOD = (long) Math.pow(10, 9) + 7;

    public int countGoodNumbers(long n) {
        long evenCount = (n + 1) / 2;
        long oddCount = n / 2;

        long evenPow = modPow(5, evenCount);
        long oddPow = modPow(4, oddCount);

        return (int) ((evenPow * oddPow) % MOD);
    }

    private long modPow(long base, long exp) {
        long result = 1;
        base %= MOD;

        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            exp /= 2;
        }

        return result;
    }
}
