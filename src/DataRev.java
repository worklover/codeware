public class DataRev {
    public static int[] DataReverse(int[] data) {
        int [] data2 = new int[data.length];
        int j =0,k=8;
        for (int i=0 ; i < data.length; i++) {
            data2[(data.length - k) + j] = data[i];
            j = j + 1;
            //System.out.println(data2[(data.length - k) + j]+" " + data[i]);
            if (j == 8) {
                j = 0;
                k = k + 8;
            }
        }
        return  data2;
    }
}