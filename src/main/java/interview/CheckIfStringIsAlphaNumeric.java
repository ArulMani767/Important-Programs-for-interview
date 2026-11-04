package interview;

public class CheckIfStringIsAlphaNumeric {
    public static void main(String[] args) {
        String input = "Java21";

        boolean isAlphanumeric = input != null && !input.isEmpty() &&
                input.chars().allMatch(Character::isLetterOrDigit);

        System.out.println("Is alphanumeric: " + isAlphanumeric);
    }
}

// alternative way to check if a string is alphanumeric

/*String input = "Java21";
        
        // ^ matches start, $ matches end, [a-zA-Z0-9]+ ensures 1 or more alphanumeric characters
        boolean isAlphanumeric = input.matches("^[a-zA-Z0-9]+$");
        
        System.out.println("Is alphanumeric: " + isAlphanumeric); */
