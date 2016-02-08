public class Trigrams {
    public static String trigrams( String phrase ) {
        String trig ="";
        if (phrase.length() <= 2) return  "";
        phrase = phrase.replaceAll(" ","_");
        for (int i= 0; i<=phrase.length()-3; i++ ) {
            trig = trig + phrase.substring(i,i+3);
            if ( i != phrase.length()-3) trig=trig+" ";
        }
        return  trig;
    }
}
