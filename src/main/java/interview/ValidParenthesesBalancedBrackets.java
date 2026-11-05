package interview;

public class ValidParenthesesBalancedBrackets {
    public static void main(String[] args) {
        var input = "{[()]}";

        // Way 1 (Simplest): Track length and strip valid pairs until no more pairs can be removed
        var temp = input;
        var prevLen = -1;
        while (temp.length() != prevLen) {
            prevLen = temp.length();
            temp = temp.replace("()", "").replace("{}", "").replace("[]", "");
        }
        System.out.println("Is '" + input + "' balanced? " + temp.isEmpty());

        // Way 2 (Java 21 switch expression + Stack — single O(n) pass):
        /*
        var stack = new ArrayDeque<Character>();
        var isBalanced = true;

        for (var c : input.toCharArray()) {
            switch (c) {
                case '(' -> stack.push(')');
                case '{' -> stack.push('}');
                case '[' -> stack.push(']');
                default -> {
                    if (stack.isEmpty() || stack.pop() != c) isBalanced = false;
                }
            }
        }
        System.out.println("Is '" + input + "' balanced? " + (isBalanced && stack.isEmpty()));
        */
    }
}
