package services.branches;

public class Task15 {
    public static double solve(double x) {
        if (x <= 3)
            return x * x - 3 * x + 9;
        return 1 / (Math.pow(x, 3) + 6);
    }
}
