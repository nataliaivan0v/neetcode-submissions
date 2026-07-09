class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Deque<Character> parens = new ArrayDeque<Character>();
        for (Character c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                parens.push(c);
            } else if (parens.peek() == null) {
                return false;
            } else {
                Character pop = parens.pop();
                if ((c == ')' && pop != '(') || (c == '}' && pop != '{') || (c == ']' && pop != '[')) {
                    return false;
                }
            }
        }
        return parens.size() == 0;
    }
}
