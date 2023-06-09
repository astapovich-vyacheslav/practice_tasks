import services.cycles.*;
import services.linear.*;
import services.branches.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> results = new ArrayList<>();
        //Linear programming
        double res1 = Task1.solve(1, 2, 3);
        double res2 = Task2.solve(1, 2, 3);
        double res3 = Task3.solve(1.5, 3.14);
        double res4 = Task4.solve(123.456);
        String res5 = Task5.solve(10363); //2 52 43
        boolean res6 = Task6.solve(1, 2);

        //Branching
        boolean[] res11 = Task11.solve(30, 60);
        Object res12 = Task12.solve(1, 2, 3, 4);
        Object res13 = Task13.solve(1, 3, 2, 6, 3, 9);
        Object res14 = Task14.solve(5, 7, 3, 6, 100);
        Object res15 = Task15.solve(3);

        //Cycles
        int[] res21 = Task21.solve(-5, 10, 1);
        int res22 = Task22.solve(10);
        int res23 = Task23.solve();
        BigInteger res24 = Task24.solve();
        double res25 = Task25.solve(0.001);
        int[] res26 = Task26.solve("Hello! 012345");
        ArrayList<ArrayList<Integer>> res27 = Task27.solve(10, 15);
        ArrayList<Integer> res28 = Task28.solve(12300, 2099);


        results.add(res1);
        results.add(res2);
        results.add(res3);
        results.add(res4);
        results.add(res5);
        results.add(res6);
        results.add(res11);
        results.add(res12);
        results.add(res13);
        results.add(res14);
        results.add(res15);
        results.add(res21);
        results.add(res22);
        results.add(res23);
        results.add(res24);
        results.add(res25);
        results.add(res26);
        results.add(res27);
        results.add(res28);

        results.forEach(r -> {
            if (r instanceof boolean[] boolArray) {
                System.out.println(Arrays.toString((boolean[])r));
            } else if (r instanceof int[] intArray) {
                System.out.println(Arrays.toString((int[])r));
            } else if (r instanceof ArrayList intArray) {
                ((ArrayList<?>) r).forEach(element -> System.out.print(element + " "));
                System.out.println();
            }
            else {
                System.out.println(r);
            }
        });
    }
}