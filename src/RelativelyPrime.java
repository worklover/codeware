import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.math.RoundingMode;

public class RelativelyPrime {
    public static double coprimeProbablity(int n) {
        if (n == 0) return 0;
        int counter=n-1,x=n;
        double result=0;

        while (x>1) {

                for (int i = 1; i < x; i++) {
                    int a = i, b = x;
                        while (a != 0 && b != 0) {
                            if (a >= b) a = (a % b);
                            else b = (b % a);
                        }
                        if ((a + b) > 1) counter = counter + 2;
                        System.out.println(counter);
                }
            x=x-1;
            System.out.println(counter);
        }
        result =(n*n-counter);
        return  (new BigDecimal(result).setScale(3, RoundingMode.UP).doubleValue())/(n*n);
    }
}