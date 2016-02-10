public class CountDig {

    public static int nbDig(int n, int d) {
        String  tmp ="";
        int result =0;
        int result1 =0;
        for (int i=0; i<=n; i ++ ) {
            tmp =String.valueOf(i * i);
            result = tmp.length();
            result1 =result1 + (result - tmp.replace(Integer.toString(d),"").length() );
        }
        return result1;
    }
}
/*
import static org.junit.Assert.*;

import org.junit.Test;


public class CountDigTest {
    private static void testing(int actual, int expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test() {
        System.out.println("Fixed Tests nbDig");
        testing(CountDig.nbDig(5750, 0), 4700);
        testing(CountDig.nbDig(11011, 2), 9481);
        testing(CountDig.nbDig(12224, 8), 7733);
        testing(CountDig.nbDig(11549, 1), 11905);
    }
}
 */