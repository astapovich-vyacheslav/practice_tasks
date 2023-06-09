package services.cycles;

import java.util.ArrayList;
import java.util.HashSet;

public class Task28 {
    public static ArrayList<Integer> solve(int m, int n) {
        ArrayList<Integer> result = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        while (m != 0) {
            set1.add(m % 10);
            m /= 10;
        }
        while (n != 0) {
            set2.add(n % 10);
            n /= 10;
        }
        set1.forEach(i -> {
            if (set2.contains(i))
                result.add(i);
        });
        return result;
    }
}
