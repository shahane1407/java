import java.util.Scanner;

public class SpecialSymbolExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.print("Special Symbols: ");

        for (char c : input.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                System.out.print(c + " ");
            }
        }

        sc.close();
    }
}
