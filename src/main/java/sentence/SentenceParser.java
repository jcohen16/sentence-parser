package sentence;

public class SentenceParser {
	
	/***
	 * 
	 * @param input: expected to be string of words, each separated by a space
	 * @return: longest word in string
	 * 
	 * Request was to return string and length of string
	 * As the method can only return one value, it returns a String, which itself has a length() method
	 * Tests verify the string is the expected one, and the length is as expected as well
	 * 
	 */
	public static String getLongestWord(String input) {
		String result = "";
		
		String[] words = input.split(" ");
		for(String word : words) {
			if(word.length() > result.length()) {
				result = word;
			}
		}
		
		return result;
	}

}