
public class Quicksum {
    public int quicksum(String packet) {
        System.out.println(packet);
        int crc = 0;
        int pos;
        String abc = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if (packet.matches("([A-Z])([A-Z\\s])(.*)")) {
            //if(packet.matches("^[A-Z ]+$")){
            for (int i = 1; i <= packet.length(); i++) {
                pos = abc.indexOf(packet.charAt(i - 1));
                System.out.println(pos);
                crc = crc + (pos * i);
            }
            return crc;
        }
        return 0;
    }
}