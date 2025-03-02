import java.util.Scanner;

public class CapitalizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();

        String capitalizedSentence = capitalizeFirstLetters(input);
        System.out.println("Capitalized sentence: " + capitalizedSentence);
    }

    public static String capitalizeFirstLetters(String sentence) {
        char[] charArray = sentence.toCharArray();
        boolean capitalizeNext = true;

        for (int i = 0; i < charArray.length; i++) {
            if (Character.isWhitespace(charArray[i])) 
                capitalizeNext = true;
            else if (capitalizeNext) {
                charArray[i] = Character.toUpperCase(charArray[i]);
                capitalizeNext = false;
            }
        }

        return new String(charArray);
    }
}