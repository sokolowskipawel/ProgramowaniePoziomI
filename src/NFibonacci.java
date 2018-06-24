public class NFibonacci {

    public int nElementCalculate(int n) {
        if (n <= 1) {
            return n;
        } else {
            return nElementCalculate(n - 1) + nElementCalculate(n - 2);
        }
    }

    public int nElementCalcIteration(int n) {

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int f1 = 0;
        int f = 1;

        for (int i = 2; i <= n; i++) {
            int m;

            m = f1 + f;
            f1 = f;
            f = m;
        }
        return f;
    }
}
