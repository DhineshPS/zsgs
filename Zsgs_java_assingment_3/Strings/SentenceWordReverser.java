import java.util.Scanner;

public class SentenceWordReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence to reverse its words:");
        String input = scanner.nextLine();

        String reversedSentence = reverseWords(input);
        System.out.println("Reversed sentence: " + reversedSentence);
    }

    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        int left = 0;
        int right = words.length - 1;

        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }

        return String.join(" ", words);
    }
}