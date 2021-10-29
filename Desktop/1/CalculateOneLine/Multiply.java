
class Main {
    public int multiply(int n, int m) {
        int ans = 0;
        while (m > 0) {
            if ((m & 1) != 0)
                ans = ans + n;

            n = n << 1;
            m = m >> 1;
        }
        return ans;

    }
}