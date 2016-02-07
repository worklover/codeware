import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator{
    public static boolean validate(String input){
        // Pattern p = Pattern.compile("^[a-z]+[a-z0-9-_]*\\@[a-z\\_\\-]*\\.[a-z0-9_-](\\.)*[a-z0-9_-]*[A-z]$ ");
        System.out.println(input);
        // return input.matches("[a-z]+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*\\.\\w{2,4}");
        return input.matches("[a-z]+([\\.-]?\\w+)*[a-z0-9]+@[a-z0-9]+([\\.-]?\\w+)*(\\.){1,1}[a-z]{2,4}$");

    }
}
/*
import org.junit.*;


public class test{
    public @Test void runTests(){
        System.out.println("test1");
        Assert.assertEquals("Didn't accept valid email", EmailValidator.validate("abc@example.com"), true);
        System.out.println("test2");
        Assert.assertEquals("Accepted invalid email", EmailValidator.validate("_bc@example.com"), false);
        System.out.println("test3");
        Assert.assertEquals("Didn't accept valid email", EmailValidator.validate("abc123@example-123.co.uk"), true);
        System.out.println("test4");
        Assert.assertEquals("Didn't accept valid email", EmailValidator.validate("abc_123@a-1_23.co.uk"), true);
        System.out.println("test5");
        Assert.assertEquals("Accepted invalid email", EmailValidator.validate("asdf@asdf.asdf.s.123.1_a._._._._"), false);
    }
}
*/