/*import java.util.Arrays;

class Epidem {

    public static int epidemic(int tm, int n, int s0, int i0, double b, double a) {
      int  max = 0;
      double s=s0;
      double i=i0;
      double r=0;
        int j=1;
        while (max < i){
            if (max < i) max = (int) i;
            s = s - (double) j*tm/n*b*s0*i0;
            i = i + (double) j*tm/n*(b*s0*i0-a*i0);
            r = r + (double) j*tm/n*i0*a;
            //s=s-r;
            System.out.println("s = "+ s +" i= "+i+" r= "+r);
            j++;
        }
        System.out.println(max);
        return max;
    }
}
*/
import java.util.Arrays;

class Epidem {

    public static int epidemic(int tm, int n, int s0, int i0, double b, double a) {
        int r0 = 0;
        double[] infecteds = new double[n];
        double[] susceptibles = new double[n];
        double[] recovereds = new double[n];
        double dt = 1.0 * tm / n;
        infecteds[0] = i0;
        susceptibles[0] = s0;
        recovereds[0] = r0;

        for (int i = 1; i < n; i++) {
            infecteds[i] = infecteds[i-1] + dt * (b * susceptibles[i-1] * infecteds[i-1] - a * infecteds[i-1]);
            susceptibles[i] = susceptibles[i-1] - dt * b * susceptibles[i-1] * infecteds[i-1];
            recovereds[i] = recovereds[i-1] + dt * a * infecteds[i-1];
        }

        Arrays.sort(infecteds);
        return (int)infecteds[n-1];
    }
}

