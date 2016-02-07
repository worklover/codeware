
public class PalindromChecker {
    public static boolean isPalindrome(String str) {
        if (str == null ) return false;
        String polForward =str.toLowerCase().replaceAll("[\\W0-9]","");
        String polReward = new StringBuffer(polForward).reverse().toString();
        if (polForward.equals("")) return false;
        if (polForward.equals(polReward)) return true;
        else return false;
    }
}

