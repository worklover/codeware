import java.lang.reflect.Array;
import java.util.Arrays;

public class Uniknumbers {
    public static boolean hasUniqueChars(String str) {
        String result;
        if (str == null || str == "") return true;
        char []  s = str.toCharArray();
        Arrays.sort(s);
        for (int i = 1; i<s.length; i++){
            if (s[i] == s[i-1]) return false;
        }
        return true;
    }
}
/*
public class Kata {
  public static boolean hasUniqueChars(String str) {
    return str.chars().distinct().count() == str.chars().count();
  }
}
 */