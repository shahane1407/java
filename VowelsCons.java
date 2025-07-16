import java.util.*;

class VowelsCons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();

        s = s.toLowerCase();
        int countVowels = 0;
        int countCons = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    countVowels++;
                } else {
                    countCons++;
                }
            }
        }

        System.out.println("Vowels: " + countVowels);
        System.out.println("Consonants: " + countCons);

        sc.close();
    }
}
