/**
 * Created by vladislav.maneev on 02.02.2016.
 */
public class Leetspeak extends Encoder{
    public String encode(String source){
        if (source == null) return "";
        String encodeSource = source;
        encodeSource=encodeSource.replaceAll("a","4").replaceAll("A","4");
        encodeSource=encodeSource.replaceAll("e","3").replaceAll("E","4");
        encodeSource=encodeSource.replaceAll("l","1").replaceAll("L","4");
        encodeSource=encodeSource.replaceAll("o","0").replaceAll("O","4");
        encodeSource=encodeSource.replaceAll("u","(_)").replaceAll("U","4");
        encodeSource=encodeSource.replaceAll("m", "/^^\\\\").replaceAll("M","4");
        return encodeSource;
    }
}

abstract class Encoder{
    public abstract String encode(String source);


}
