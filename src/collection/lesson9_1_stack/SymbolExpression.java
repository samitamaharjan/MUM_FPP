package collection.lesson9_1_stack;

import java.util.Stack;

class SymbolExpression {
    public static void main (String[] args) {
        String str = "[]({()()})[][{()[()({}{[]})]}]()";
        boolean valid = isValid(str);
        System.out.println(valid == true ? "Success" : "Fail");
    }
    
    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } else if (ch == '}' || ch == ']' || ch == ')') {
                char popped = stack.pop();
                if (popped == '{' && ch == '}'
                   || popped == '(' && ch == ')'
                   || popped == '[' && ch == ']') {
                    continue;
                }
                return false;
            }
        }
        return stack.isEmpty();
    }
}
