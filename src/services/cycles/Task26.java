package services.cycles;

public class Task26 {
    public static int[] solve(String str) {
        int len = str.length();
        int[] result = new int[len];
        for (int i = 0; i < len ; i++) {
            result[i] = (int) str.charAt(i);
        }
        return result;
    }
}
