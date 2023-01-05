public class Level1 {
    public static int[] MadMax(int n, int[] Tele) {
        if (n == 1) {
            return Tele;
        }

        int[] digitsArray = new int[n];
        for (int i = 0; i < n; i++) {
            digitsArray[i] = Tele[i];
        }

        // сортируем массив по возрастанию
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < n - 1; i++) {
                if (digitsArray[i + 1] < digitsArray[i]) {
                    int t = digitsArray[i];

                    digitsArray[i] = digitsArray[i + 1];
                    digitsArray[i + 1] = t;

                    isSorted = false;
                }
            }
        }

        // сортируем массив, максимальное число в центре
        // слева от максимального сортировка по возрастанию
        // справа по убыванию
        for (int i = 0; i < n / 3; i++) {
            int t = digitsArray[n / 2 + i];

            digitsArray[n / 2 + i] = digitsArray[n - 1 - i];
            digitsArray[n - 1 - i] = t;
        }

        return digitsArray;
    }
}
