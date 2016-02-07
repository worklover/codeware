public class FizzBuzz {

    public static String convert(int i) {
        String result="";
        if (i%3 == 0)  result = "fizz";
        if (i%5 == 0)  result = "buzz";
        if (i%3 == 0 && i%5 == 0)  result = "fizz buzz";
        if (result.length()== 0) result = Integer.toString(i);
        return result;

    }

}