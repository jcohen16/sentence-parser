package sentence;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import sentence.SentenceParser;

public class SentenceParserTest {
	
	@Rule
	public final ExpectedException exception = ExpectedException.none();

	@Test
	public void sentenceTest() {
		
		String word = SentenceParser.getLongestWord("the longest yard");
		assertEquals("longest", word);
		assertEquals(7, word.length());
	}
	
	@Test
	public void longestWordFirst() {
		String word = SentenceParser.getLongestWord("pleasure to meet you");
		assertEquals("pleasure", word);
		assertEquals(8, word.length());
	}
	
	@Test
	public void longestWordLast() {
		String word = SentenceParser.getLongestWord("this is a longer sentence");
		assertEquals("sentence", word);
		assertEquals(8, word.length());
	}
	
	@Test
	public void oneWordTest() {
		String word = SentenceParser.getLongestWord("xyz");
		assertEquals("xyz", word);
		assertEquals(3, word.length());
	}
	
	@Test
	public void specialCharsTest() {
		String word = SentenceParser.getLongestWord("463jh$%^ h3j4h ^&*");
		assertEquals("463jh$%^", word);
		assertEquals(8, word.length());
	}
	
	@Test
	public void emptyStringTest() {
		String word = SentenceParser.getLongestWord("");
		assertEquals("", word);
		assertEquals(0, word.length());
	}

	@Test
	public void nullTest() {
		exception.expect(NullPointerException.class);
		String word = SentenceParser.getLongestWord(null);
	}
}
