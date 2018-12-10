package com.bravitest.balancedbrackets;

import java.util.Stack;

public class BalancedBrackets {

	public boolean isValidBrackets(String brackets) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < brackets.length(); i++) {
			char c = brackets.charAt(i);
			if (c == '[' || c == '(' || c == '{') {
				stack.push(c);
			} else if (c == ']') {
				if (stack.isEmpty() || stack.pop() != '[') {
					return false;
				}
			} else if (c == ')') {
				if (stack.isEmpty() || stack.pop() != '(') {
					return false;
				}
			} else if (c == '}') {
				if (stack.isEmpty() || stack.pop() != '{') {
					return false;
				}
			}

		}
		return stack.isEmpty();
	}
}
