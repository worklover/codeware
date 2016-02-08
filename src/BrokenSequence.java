import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import com.sun.xml.internal.ws.api.pipe.NextAction;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BrokenSequence {
    public int findMissingNumber(String sequence) {
        int missing = 0;
        String tmp="";
        int n = 0;
        ArrayList<Integer> s = new ArrayList<Integer>();
        if (sequence.length() == 0 || sequence == null) return 0;
        if (sequence.matches("[\\D]*")) return 1;
        for (int i=0; i<sequence.length(); i++) {
            if (sequence.charAt(i) != ' '  ) {
                tmp = tmp + sequence.charAt(i);
            }
            else {
                n = Integer.parseInt(tmp);
                s.add(n);
                tmp ="";
            }
        }
        n = Integer.parseInt(tmp);
        s.add(n);
        tmp ="";
        Collections.sort(s);
//        System.out.println(s);
        if (s.get(s.size()-1) == s.size() ) return 0;
        if (s.get(0) == 2) return 1;
        for (int i = 1 ; i<s.size(); i++ ) {
            if (s.get(i-1) != s.get(i)-1 ) {missing = s.get(i-1) +1; }
        }
//        System.out.println(missing);
        return missing;
    }
}

/*
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class test{

    @Test
    public void test1() {
        assertEquals("", 4, new BrokenSequence().findMissingNumber("6 1 2 3 5 7"));
    }

    @Test
    public void test2() {
        assertEquals("", 2, new BrokenSequence().findMissingNumber("1 3"));
    }

    @Test
    public void test3() {
        assertEquals("", 0, new BrokenSequence().findMissingNumber(""));
    }
    @Test
    public void test4() {
        assertEquals("", 1, new BrokenSequence().findMissingNumber("2 3 4 5"));
    }
    @Test
    public void test5() {
        assertEquals("", 1, new BrokenSequence().findMissingNumber("_______"));
    }

}
 */


