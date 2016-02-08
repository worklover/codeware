import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.lang.Math;
public class SqProd2Sum {
    public static List<long[]> prod2Sum(long a, long b, long c, long d) {
        List<long[]> result = new ArrayList<long[]>(){};
        Long sum = 0L;
        long[] tmp = new long[2];
        int squrt = 0;
        try {

            sum = (a * a + b * b) * (c * c + d * d);
            sum = 40648930L;
            System.out.println(sum);
        } catch (ArithmeticException e) {
          System.out.println(" sum Arithmetic Error");
        }
        try {
            squrt = (int) Math.sqrt(sum);
        } catch (ArithmeticException e) {
            System.out.println(" Sqrt Error");
        }
        for (int i = 1; i <= squrt/2+3 ; i++) {
            tmp[0] = i*i;
            tmp[1] = (long) Math.sqrt(sum -tmp[0]);
            if ( (int)(tmp[0])+ (int)(tmp[1]*tmp[1]) == sum ) {
                tmp[0] = (long) i;
                result.add(tmp.clone());
            }
        }
        System.out.println(result.size());
        return result;
    }
}
/*
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {

    @Test
    public void test0() {
        List<long[]> exp = new ArrayList<long[]>();
        long[] cc = new long[] {1, 7};
        exp.add(cc);
        long[] dd = new long[] {5, 5};
        exp.add(dd);
        assertArrayEquals(exp.get(0), SqProd2Sum.prod2Sum(1, 2, 1, 3).get(0));
        assertArrayEquals(exp.get(1), SqProd2Sum.prod2Sum(1, 2, 1, 3).get(1));

        exp = new ArrayList<long[]>();
        cc = new long[] {2, 23};
        exp.add(cc);
        dd = new long[] {7, 22};
        exp.add(dd);
        assertArrayEquals(exp.get(0), SqProd2Sum.prod2Sum(2, 3, 4, 5).get(0));
        assertArrayEquals(exp.get(1), SqProd2Sum.prod2Sum(2, 3, 4, 5).get(1));
    }
}

 */