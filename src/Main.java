import services.linear.*;
import services.branches.*;

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


        boolean[] res11 = Task11.solve(30, 60);
        Object res12 = Task12.solve(1, 2, 3, 4);
        Object res13 = Task13.solve(1, 3, 2, 6, 3, 9);
        Object res14 = Task14.solve(5, 7, 3, 6, 100);
        Object res15 = Task15.solve(3);

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

        results.forEach(r -> {
            if (r instanceof boolean[] boolArray) {
                System.out.println(Arrays.toString((boolean[])r));
            } else {
                System.out.println(r);
            }
        });
    }
}