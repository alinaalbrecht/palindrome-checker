package palindromeChecker;
import java.util.*;

public class PalindromeChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the phrase you want to test as a palindrome. Please note we will ignore punctuation, spaces, and symbols when analyzing your phrase.");
	String phrase = scanner.nextLine();
	isPlalindrome(phrase);
	

	}
	
	public static void isPlalindrome(String phrase) {
		String regexString = "\\W+|_";
		phrase = phrase.toLowerCase();
		String formattedPhrase = phrase.replaceAll(regexString, "");
		String[] reverseArr= formattedPhrase.split("");
		Collections.reverse(Arrays.asList(reverseArr));
		String reverseTest = String.join("", reverseArr);
		if (reverseTest.equals(formattedPhrase)) {
			System.out.println(formattedPhrase + " is a palindrome!");
		}
		else {
			System.out.println(formattedPhrase + " is not a palindrome!");
		}
	}

}
