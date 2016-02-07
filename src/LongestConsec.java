import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

class LongestConsec {

    public static String longestConsec(String[] strarr, int k) {
       if (strarr.length == 0 || k <0 || strarr.length < k  ) return "";
        String [] tmp = (String[])strarr.clone();
        String result="";
        int[] index = new int[k];
        int n=0;
        while ( n <k) {
            result = "";
            for (int i = 0; i < tmp.length; i++) {
                if (tmp[i].length() > result.length()) {
                    result=tmp[i];
                    index[n] = i;
                }
            }
            for (int i =0; i<tmp.length; i++) {
                if (tmp[i] == result) {
                    tmp[i] = "";
                }
            }
            n++;
        }
        Arrays.sort(index);
            result = "";
        for (int i =0 ; i<k ; i++) {
          result = result + (String) strarr[index[i]];
        }
        return result;
    }
}
/*
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class LongestConsec {

  public static String longestConsec(String[] strArr, int k) {
    return (k > 0 && strArr.length > 0 && k <= strArr.length) ?
      IntStream.rangeClosed(0, strArr.length - k)
        .mapToObj(i -> IntStream.range(0, k).mapToObj(j -> strArr[i + j]).collect(Collectors.joining()))
        .sorted((s1, s2) -> Integer.compare(s2.length(), s1.length()))
        .findFirst().get()
      : "";
  }
}
 */