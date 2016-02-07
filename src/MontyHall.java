import static java.lang.Math.*;

public class MontyHall {

    public int montyHallCase(int correctDoorNumber, int[] participantGuesses) {
        double profit ;
        int winer=0;
        int peopls = participantGuesses.length;
        for ( int i =0; i<peopls ; i++) {
            if (correctDoorNumber == participantGuesses[i]) {winer=winer+1;}
        }
        profit =(double) (peopls -winer)*100 /peopls ;
        System.out.println(String.format("%.4f",profit));
        return  (int) round(profit);
    }

}

/*
import java.util.Arrays;

public class MontyHall {

    public int montyHallCase(int correctDoorNumber, int[] participantGuesses) {
        long winners = Arrays.stream(participantGuesses)
                .filter(door -> door != correctDoorNumber)
                .count();
        return (int) Math.round(100.0 * winners / participantGuesses.length);
    }

}
 */