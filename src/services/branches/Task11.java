package services.branches;

import java.util.ArrayList;

public class Task11 {
    public static boolean[] solve(int a, int b) {
        if (a == 0 || b == 0)
            return new boolean[]{false, false};
        if (a + b >= 180) {
            return new boolean[]{false, false};
        }
        if (a + b == 90) {
            return new boolean[]{true, true};
        }
        return new boolean[]{true, false};
    }
}
