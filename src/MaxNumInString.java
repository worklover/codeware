import java.util.ArrayList;
        import java.util.Collections;

public class MaxNumInString {
    public static String HighAndLow(String numbers) {
        String result = "";
        String tmp="";
        int n = 0;
        ArrayList<Integer> s = new ArrayList<Integer>();
        if (numbers.length() == 0 || numbers == null) return "";
        if (numbers.matches("[\\D]*")) return "";
        for (int i=0; i<numbers.length(); i++) {
            if (numbers.charAt(i) != ' '  ) {
                tmp = tmp + numbers.charAt(i);
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
        Collections.reverse(s);
        result =s.get(0).toString() +" " + s.get(s.size()-1).toString();
        return result;
    }
}
/*
import java.util.Arrays;

public class Kata {
    public static String HighAndLow(String numbers) {

        int min = Arrays.stream(numbers.split(" "))
                        .mapToInt(i -> Integer.parseInt(i))
                        .min()
                        .getAsInt();

        int max = Arrays.stream(numbers.split(" "))
                        .mapToInt(i -> Integer.parseInt(i))
                        .max()
                        .getAsInt();

        return String.format("%d %d", max, min);
    }
}
 */