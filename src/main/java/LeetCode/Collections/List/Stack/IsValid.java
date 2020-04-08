package LeetCode.Collections.List.Stack;

import java.util.Stack;

/**
 * @Author: wujiaji
 * @Date: 2020-04-07 20:10
 * @Description: 20. 有效的括号
 * @URL: //https://leetcode-cn.com/problems/valid-parentheses/
 **/
public class IsValid {
    public static void main(String[] args) {
        IsValid obj = new IsValid();
        String s = "([)]";
        System.out.println(obj.isValid(s));
    }

    public boolean isValid(String s) {
        if (s.length() == 0) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            stack.push(ch);
            if (!stack.isEmpty() && stack.size() >= 2) {
                switch (stack.peek()) {
                    case ')':
                        if (stack.elementAt(stack.size() - 2) == '(') {
                            stack.pop();
                            stack.pop();
                        }
                        break;
                    case ']':
                        if (stack.elementAt(stack.size() - 2) == '[') {
                            stack.pop();
                            stack.pop();
                        }
                        break;
                    case '}':
                        if (stack.elementAt(stack.size() - 2) == '{') {
                            stack.pop();
                            stack.pop();
                        }
                        break;
                    default:
                        break;
                }
            }
        }
        if (!stack.isEmpty() && stack.peek() == ')' && stack.peek() == ']' && stack.peek() == '}') {
            return false;
        }
        return stack.isEmpty();
    }
}
