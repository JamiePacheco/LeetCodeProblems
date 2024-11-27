package Problems.Stack;

import java.util.Stack;

public class ValidParentheses {
    class Solution {
        public boolean isValid(String s) {
            Stack<Character> parStack = new Stack<>();
            for (char par : s.toCharArray()) {
                if (par == '(' || par == '[' || par == '{') {
                    parStack.push(par);
                }
                if (par == ')') {
                    if (parStack.isEmpty() || parStack.pop() != '(') return false;
                }
                if (par == ']') {
                    if (parStack.isEmpty() || parStack.pop() != '[') return false;
                }
                if (par == '}') {
                    if (parStack.isEmpty() || parStack.pop() != '{') return false;
                }
            }
            return parStack.isEmpty();
        }
    }
}
