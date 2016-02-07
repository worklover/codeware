public class Ball {

    public static int maxBall(int v0) {
        int t=0;
        int s=0;
        double max =0;
        double h= 0;
        while (h >=0) {
            t++;
            h= (double) v0*t*0.1/3.6 - (double) 0.5*9.81*t*t*0.01;
            if (h>max) {max=h; s=t;}
        }
return s;
    }
}