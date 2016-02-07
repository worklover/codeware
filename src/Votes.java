import java.lang.reflect.Array;

public class Votes {
    public static int[] getSum(int[][] votes) {
        int[] results = {0,0};
        for (int i=0; i< votes.length; i++) {
            results [0] = results[0] + votes [i][0];
            results [1] = results[1] + votes [i][1];
        }
        return results;
    }
}
/*
public class Votes {
    public static int[] getSum(int[][] votes) {
        int res[] = {0, 0};
        for (int[] i: votes) {
            res[0] += i[0];
            res[1] += i[1];
        }
        return res;
    }
}


 */