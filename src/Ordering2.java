import java.util.Arrays;
import java.util.stream.Collectors;

public class Ordering2 {
    public String orderWord(String s) {
        return (s == null || s.length() == 0) ? "Invalid String!"
                : s.chars().sorted().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
    }
}