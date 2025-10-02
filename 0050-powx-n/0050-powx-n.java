class Solution {
    public double myPow(double x, int n) {
        long power = n;  
        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        return pow(x, power);
    }

    static double pow(double base, long power) {
        if (power == 0)
            return 1.0;

        double half = pow(base, power / 2);

        if (power % 2 == 0)
            return half * half;
        else
            return half * half * base;
    }
}

