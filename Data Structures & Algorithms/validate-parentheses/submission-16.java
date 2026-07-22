class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                
                char curr = stack.pop();

                if ((curr == '(' && c != ')') || (curr == '{' && c != '}') || (c == '[' && c != ']')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
