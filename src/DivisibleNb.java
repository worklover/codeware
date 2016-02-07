public class DivisibleNb {
    public static Boolean isDivisible(long n, long x, long y) {
        System.out.println(n);
        if (n%x == 0 && n%y == 0) return true;
       return false;
    }
}