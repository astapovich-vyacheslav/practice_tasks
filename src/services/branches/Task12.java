package services.branches;

public class Task12 {
    public static int solve(int a, int b, int c, int d) {
        int x = a < b ? a : b;
        int y = c < d ? c : d;
        return x > y ? x : y;
    }
}
