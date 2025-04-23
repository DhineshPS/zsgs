// How to print digitsToWords(int number) for example digitToWords(321) should print three or two ones using recursion? 

public class DigitsToWords {
    public static void main(String[] args) {
        int number = 321;
        StringBuilder sb = new StringBuilder();
        digitToWords(number, sb);
        System.out.println(sb.toString());
    }

    public static void digitToWords(int num, StringBuilder sb) {
        if(num == 0)
            return;
        int n = num % 10;
        digitToWords(num / 10, sb);

        switch(n) {
            case 1 -> {
                sb.append("one ");
            }
            case 2 -> {
                sb.append("two ");
            }
            case 3 -> {
                sb.append("three ");
            }
            case 4 -> {
                sb.append("four ");
            }
            case 5 -> {
                sb.append("five ");
            }
            case 6 -> {
                sb.append("six ");
            }
            case 7 -> {
                sb.append("seven ");
            }
            case 8 -> {
                sb.append("eight ");
            }
            case 9 -> {
                sb.append("nine ");
            }
        }
    }
}