class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        Stack<Character> stack = new Stack<>();
        backtrack(result, stack, 0, 0, n);
        return result;

    }
        private void backtrack(List<String> result, Stack<Character> stack, int open, int close, int max) {
        if (stack.size() == max * 2) {
            // Convert stack to string
            StringBuilder sb = new StringBuilder();
            for (char c : stack) sb.append(c);
            result.add(sb.toString());
            return;
        }

        if (open < max) {
            stack.push('(');
            backtrack(result, stack, open + 1, close, max);
            stack.pop(); // backtrack
        }

        if (close < open) {
            stack.push(')');
            backtrack(result, stack, open, close + 1, max);
            stack.pop(); // backtrack
        }
    }
}