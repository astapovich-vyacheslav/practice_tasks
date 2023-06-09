package services.cycles;

import java.util.ArrayList;

public class Task27 {
    public static ArrayList<ArrayList<Integer>> solve(int m, int n) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = m; i <= n; i++) {
            ArrayList<Integer> delimiters = new ArrayList<>();
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0)
                    delimiters.add(j);
            }
            result.add(delimiters);
        }
        return result;
    }
}
