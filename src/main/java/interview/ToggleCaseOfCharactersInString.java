package interview;

public class ToggleCaseOfCharactersInString {
    public static void main(String[] args) {
        var input = "Java 21 & C# 14";
        var toggled = new StringBuilder();

        for (var c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                toggled.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                toggled.append(Character.toUpperCase(c));
            } else {
                toggled.append(c);
            }
        }

        System.out.println("Toggled: " + toggled); // jAVA 21 & c# 14
    }
}
