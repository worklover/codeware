import static java.lang.String.*;

public class Braking {

    public static double dist(double v, double mu) {
        return ((v*v*25/(18*18))/(2*mu*9.81)+(v*5/18));
    }
    public static double speed(double d, double mu) {
        double g = 9.81;
        double v1;
        double det = Math.sqrt(4*mu*mu*g*g + 8*mu*g*d);
        v1 = (det -(2 * mu *g))/2;

        return v1*18/5;
    }
}