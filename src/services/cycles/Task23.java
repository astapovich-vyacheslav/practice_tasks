package services.cycles;

public class Task23 {
    public static int solve() {
        int result = 0;
        for (int i = 1; i <= 100; i++) {
            result += i * i;
        }
        return result;
    }
}
