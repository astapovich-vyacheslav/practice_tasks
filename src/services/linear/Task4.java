package services.linear;
import static java.lang.Math.*;

public class Task4 {
    public static double solve(double x) {
        int digits = (int) round(x * 1000);
        return digits % 1000 + (digits / 1000) / 1000.0;
    }
}
