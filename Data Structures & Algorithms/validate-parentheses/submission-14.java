class Solution {
    public boolean isValid(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return false;
        }
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char curr = stack.pop();
                if ((curr == '(' && c != ')') || (curr == '{' && c != '}') || (curr == '[' && c != ']')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
