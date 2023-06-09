package services.branches;

public class Task13 {
    public static boolean solve(int x1, int y1, int x2, int y2, int x3, int y3) {
        /*
        kx + b = y
        b = y - kx
        kx1 + y2 - kx2 = y1
        k(x1-x2)=y1-y2
         */
        float k = (float)(y1 - y2) / (x1 -x2);
        float b = y1 - k * x1;
        return Math.abs(k * x3 + b - y3) < 0.0001;
    }
}
