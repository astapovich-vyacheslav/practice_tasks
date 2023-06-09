package services.linear;

public class Task2 {
    public static double solve(double a, double b, double c) {
        try {
            return (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        }
        catch (Exception e) {
            System.out.println("Division by zero");
            return 0;
        }
    }
}
