public class Multiplier {
    public static long multiply(long a, long b)  {
        System.out.println(a + " " + b);
        try {
           return Math.multiplyExact(a,b) ;
        }
        catch (ArithmeticException e) {
            throw e  ;
        }
    }
}
/* public class Multiplier {
    public static long multiply(long a, long b)  throws  ArithmeticException {
        return Math.multiplyExact(a,b) ;
    }
}
*/