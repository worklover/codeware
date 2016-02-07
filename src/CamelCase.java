public class CamelCase {

    public static String cAmEl(String yourName) {
        if (yourName == null || yourName == "" ) return "";
        String result = "";
        for (int i = 0 ; i<yourName.length(); i++) {
        if ( i%2 == 0 )  result =result + yourName.toUpperCase().charAt(i);
            else result =result + yourName.toLowerCase().charAt(i);
        }

        return (String) result;
    }
}