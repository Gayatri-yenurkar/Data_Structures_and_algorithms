class Solution {
    public String removeDuplicateLetters(String s) {
           int[] lastOccurrence = new int[26];
        boolean[] inStack = new boolean[26];
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            lastOccurrence[s.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!inStack[c - 'a']) {
                while (!stack.isEmpty() && c < stack.peek() && i < lastOccurrence[stack.peek() - 'a']) {
                    inStack[stack.pop() - 'a'] = false;
                }
                inStack[c - 'a'] = true;
                stack.push(c);
            }
        }
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }

        return result.toString();
    }
}