import java.util.function.LongToDoubleFunction;

public class Primitive {
    public String determineType(String number) {
        try {
            Long tmp = new Long(number);
        }
        catch (NumberFormatException e) {
            return "none";
        }
        try {
            int tmp = new Integer(number);
        }
        catch (NumberFormatException e) {
            return "long";
        }
        try {
            short tmp = new Short(number);
        }
        catch (NumberFormatException e) {
            return "int";
        }
        try {
            byte tmp = new Byte(number);
            return "byte";
        }
        catch (NumberFormatException e) {
            return "short";
        }
    }
}
/*import java.math.BigInteger;

public class Primitive {

    public String determineType(String number) {
        if (number == null || !number.matches("^[\\-]{0,1}\\d+")) return "none";
        int count = (new BigInteger(number)).bitLength();
        if (count < 8) return "byte";
        if (count < 16) return "short";
        if (count < 32) return "int";
        if (count < 64) return "long";
        return "none";
    }
}
*/
