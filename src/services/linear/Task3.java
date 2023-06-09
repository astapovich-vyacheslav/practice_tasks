package services.linear;
import static java.lang.Math.*;

public class Task3 {
    public static double solve(double x, double y) {
        try {
            return (sin(x) + cos(y)) / (cos(x) - sin(y)) * tan(x * y);
        }
        catch (Exception e) {
            System.out.println("Computing error");
            return 0;
        }
    }
}
