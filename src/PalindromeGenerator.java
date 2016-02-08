
public class PalindromeGenerator {
    public boolean isPalindrome(String word) {
        if (word == null ) return false;
        String polReward = new StringBuffer(word).reverse().toString().toLowerCase();
        System.out.println(word +" | " + polReward);
        if (word.toLowerCase().equals(polReward)) return true;
        return false;
    }

    public String generateString(String word) {
        if (isPalindrome(word)) return word ;
        String polReward = new StringBuffer(word).reverse().toString();
        return (String) word+polReward ;
    }
}
/*
import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeGeneratorTest {

	private PalindromeGenerator underTest = new PalindromeGenerator();

	@Test
	public void testIsPalindromeWithSuccess() {
		assertEquals(true, underTest.isPalindrome("otto"));
	}

	@Test
	public void testIsPalindromeWithFailure() {
		assertEquals(false, underTest.isPalindrome("noob"));
	}

	@Test
	public void testGenerateStringWithPalindrome() {
		assertEquals("otto", underTest.generateString("otto"));
	}

	@Test
	public void testGenerateStringWithCasePalindrome() {
		assertEquals("Otto", underTest.generateString("Otto"));
	}

	@Test
	public void testGenerateStringWithOddPalindrome() {
		assertEquals("oto", underTest.generateString("oto"));
	}

	@Test
	public void testGenerateStringWithoutPalindrome() {
		assertEquals("ottonoobTest123321tseTboonotto", underTest.generateString("ottonoobTest123"));
	}

}
 */