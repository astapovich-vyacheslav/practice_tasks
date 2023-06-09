package services.cycles;

public class Task21 {
    public static int[] solve(int a, int b, int h) {
        int[] result = new int[(b - a) / h + 1];
        for (int i = 0; a <= b; a += h, i++) {
            result[i] = a;
            if (a <= 2)
                result[i] = -a;
        }
        return result;
    }
}
