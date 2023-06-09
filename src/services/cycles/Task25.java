package services.cycles;

public class Task25 {
    public static double solve(double e) {
        int q1 = 2;
        int q2 = 3;
        double d1 = 1.0 / q1;
        double d2 = 1.0 / q2;
        double a = d1 + d2;
        double result = a;
        for (int n = 1; a >= e ; n++) {
            d1 /= q1;
            d2 /= q2;
            a = d1 + d2;
            result += a;
        }
        return result;
    }
}
