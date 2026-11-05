package interview;

public class PangramStringCheck {
    public static void main(String[] args) {
        var input = "The quick brown fox jumps over the lazy dog";

        // Convert to lowercase, keep only letters, and check if distinct count == 26
        var isPangram = input.toLowerCase()
                .chars()
                .filter(Character::isLetter)
                .distinct()
                .count() == 26;

        System.out.println("Is Pangram: " + isPangram); // true
    }
}
