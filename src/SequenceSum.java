import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SequenceSum {
    public static int[] sumOfN(int n) {
        int[] m = new int[Math.abs(n)+1];
        int r =1;
        if (n == 0)  return new int[]{0};
        if (n <0 ) r = -1 ;
        m[0] =0;
        for (int i=1 ; i<= Math.abs(n); i++) {
            m[i] =(i+Math.abs(m[i-1]))*r;
        }
        return m;

    }
}