/**
 * Created by vladislav.maneev on 01.02.2016.
 */
public class BracketsChecker {
    public static boolean bracketsChecker(String str) {
        int a = 0, b =0, c = 0;
        int a1 = 0, b1 =0, c1 = 0;
        for (int i=0; i<str.length(); i++) {
            if ( str.charAt(i) =='[') {a=a+i+1; a1=a1+1;}
            if ( str.charAt(i) =='(') {b=b+i+1; b1=b1+1;}
            if ( str.charAt(i) =='{') {c=c+i+1; c1=c1+1;}
            if ( str.charAt(i) ==']') {a=a-i-1; a1=a1-1;}
            if ( str.charAt(i) ==')') {b=b-i-1; b1=b1-1;}
            if ( str.charAt(i) =='}') {c=c-i-1; c1=c1-1;}
        }
        if ( (a <= 0) && (b <= 0) && (c <= 0) && (a1 == 0) && ( b1 == 0 ) && (c1 == 0)) return true;
        else return false;
    }
}
