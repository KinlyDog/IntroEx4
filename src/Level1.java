public class Level1 {
    public static int[] MadMax(int n, int[] Tele) {
        if (n == 1) return Tele;

        int[] ma = new int[n];
        for (int i = 0; i < n; i++) {
            ma[i] = Tele[i];
        }

        boolean flag = true;
        while (flag) {
            flag = false;

            for (int i = 0; i < n - 1; i++) {
                if (ma[i + 1] < ma[i]) {
                    int t = ma[i];

                    ma[i] = ma[i + 1];
                    ma[i + 1] = t;

                    flag = true;
                }
            }
        }

        for (int i = 0; i < n / 3; i++) {
            int t = ma[n / 2 + i];

            ma[n / 2 + i] = ma[n - 1 - i];
            ma[n - 1 - i] = t;
        }

        return ma;
    }
}
