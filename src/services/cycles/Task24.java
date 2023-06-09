package services.cycles;
import java.math.BigInteger;
public class Task24 {
    public static BigInteger solve() {
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 1; i <= 200; i++) {
            BigInteger squaredNumber = BigInteger.valueOf(i).multiply(BigInteger.valueOf(i));
            result = result.multiply(squaredNumber);
        }
        return result;
    }
}
