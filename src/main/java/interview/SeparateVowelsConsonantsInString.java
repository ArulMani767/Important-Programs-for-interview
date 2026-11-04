package interview;

public class SeparateVowelsConsonantsInString {
    public static void main(String[] args) {

        String input = "testing";

        StringBuilder vowels = new StringBuilder();

        StringBuilder consonants = new StringBuilder();

        for (char c : input.toCharArray()) {

            // Check if the character exists in the vowels string

            if ("aeiouAEIOU".indexOf(c) != -1) {

                vowels.append(c);

            } else if (Character.isLetter(c)) {

                consonants.append(c);

            }

        }

        System.out.println("v:'" + vowels + "', c:'" + consonants + "'");

    }
}
