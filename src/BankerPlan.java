import java.util.function.Function;

public class BankerPlan {
    public static boolean fortune(int f0, double p, int c0, int n, double i) {
        double f=f0,pr=p/100,c=c0,inf=i/100;
        for (int j=1; j<n ; j++) {
            f=f+f*pr-c;
            c=c+c*inf;
        }
        if (f >=0 ) return true;
        else return false;
    }

}

