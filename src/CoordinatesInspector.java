import java.awt.geom.Point2D;
import java.text.Format;

public class CoordinatesInspector {

    public Point2D coordinates(Double degrees, Double radius) {
        Double x ;
        Double y;
        String tmp;
        Point2D.Double s = new Point2D.Double();
        x=Math.cos(degrees*(Math.PI/180))*radius;
        y=Math.sin(degrees*(Math.PI/180))*radius;
        tmp = String.format("%10f", x.toString());
        x= Double.valueOf(tmp);
        tmp = String.format("%10f", y.toString());
        y= Double.valueOf(tmp);
        s.setLocation(x,y);
        return  s;
    }
}