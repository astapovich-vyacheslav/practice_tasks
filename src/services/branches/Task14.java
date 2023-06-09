package services.branches;

public class Task14 {
    public static boolean solve(int a, int b, int x, int y, int z) {
        int count = 3;
        if (x > a && x > b)
            count--;
        if (y > a && y > b)
            count--;
        if (z > a && z > b)
            count--;
        return count >= 2;
    }
}
