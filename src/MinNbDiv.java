public class MinNbDiv {

    public static int findMinNum(int num) {
        if (num == 0) return 0;
        int dev = 0;
        System.out.println(num + "     ");
        double tmp = 0;
        int num2=((num-2)*num)/2;
        for ( int i =num2 ; i<=2000000; i++){
            dev =0;
            for (int j=1 ;j<=i ; j++) {
                tmp = (double) i/j;
                if (tmp == (i/j) ) dev=dev+1;
            }
            if (dev == num) return (int) i;

        }
        return 0;
    }
}