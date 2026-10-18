package interview;

import java.util.Arrays;

public class CapitalizeWordsInStringArray {
    public static void main(String[] args) {
        // Hardcoded array of strings
        String[] wordsArray = { "hello world", "java 21 programming", "automation testing" };

        System.out.println("Original Array: " + Arrays.toString(wordsArray));

        // Iterate through each string in the array
        for (int i = 0; i < wordsArray.length; i++) {
            var input = wordsArray[i];
            var words = input.split("\\s+");
            var result = new StringBuilder();

            // Capitalize each word
            for (var word : words) {
                if (!word.isEmpty()) {
                    result.append(Character.toUpperCase(word.charAt(0)))
                            .append(word.substring(1).toLowerCase())
                            .append(" ");
                }
            }

            // Update the array element with the capitalized version
            wordsArray[i] = result.toString().trim();
        }

        System.out.println("Capitalized Array: " + Arrays.toString(wordsArray));
    }
}
