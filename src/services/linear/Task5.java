package services.linear;

import static java.lang.Math.*;

public class Task5 {
    public static String solve(int x) {
        int h = x / 3600;
        int m = (x % 3600) / 60;
        int s = (x % 3600) % 60;
        return h + "h " + m + "m " + s + "s";
    }
}
