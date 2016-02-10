public class Tortoise {
    public static int[] race(int v1, int v2, int g) {
        double t2 = 0;
        int[] result = new int[3];
        if (v2 < v1  || v2 <=0 || v1<=0)  return null;
        t2 = (double) (3600*g/(v2-v1)) ;
        System.out.println(t2);
        result[0] = (int) (t2/3600);
        result[1] = (int) (t2 -(result[0]*3600))/60;
        result[2]= (int) (t2 -result[0]*3600 -result[1]*60);
        return result;
    }
}

/*
import static org.junit.Assert.*;
import java.util.Random;
import org.junit.Test;


public class TortoiseTest {

    @Test
    public void test1() {
        System.out.println("Basic Tests");
        assertArrayEquals(new int[]{0, 32, 18}, Tortoise.race(720, 850, 70));
        assertArrayEquals(new int[]{3, 21, 49}, Tortoise.race(80, 91, 37));
        assertArrayEquals(new int[]{2, 0, 0}, Tortoise.race(80, 100, 40));
        assertArrayEquals(new int[]{0, 17, 4}, Tortoise.race(720, 850, 37));
        assertArrayEquals(new int[]{2, 50, 46}, Tortoise.race(720, 850, 370));
        assertArrayEquals(new int[]{0, 3, 2}, Tortoise.race(120, 850, 37));
        assertArrayEquals(new int[]{18, 20, 0}, Tortoise.race(820, 850, 550));
        assertArrayEquals(null, Tortoise.race(820, 81, 550));
    }

    // ...............

    private static int[] raceSol(int v1, int v2, int g) {
        int d = v2 - v1;
        if (d <= 0) return null;
        int h = g / d;
        int r = g % d;
        int mn = r * 60 / d;
        int s = (r * 60 % d) * 60 / d;
        return new int[]{h, mn, s};
    }

    // ...............
    @Test
    public void test2() {
        System.out.println("Random Tests");
        Random rnd = new Random();
        for (int i = 0; i < 50; i++) {
            int v1 = 50 + rnd.nextInt(700);
            int v2 = v1 + 20 + rnd.nextInt(900);
            int g = 60 + rnd.nextInt(100);
            assertArrayEquals(raceSol(v1, v2, g), Tortoise.race(v1, v2, g));
        }
    }
}
 */