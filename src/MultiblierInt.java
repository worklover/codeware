/**
 * Created by vladislav.maneev on 07.02.2016.
 */
public class MultiblierInt {
    public static int multiply(int a, int b) {
        try {
            return Math.multiplyExact(a, b);
        } catch (ArithmeticException e) {
            throw e;
        }
    }
}