package services.linear;
import static java.lang.Math.abs;
public class Task6 {
    public static boolean solve(int x, int y) {
        if (abs(x) > 4)
            return false;
        if (y > 4 || y < -3)
            return false;
        if (y < 0)
            return true;
        return abs(x) <= 2;
    }
}
