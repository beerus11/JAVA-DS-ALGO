package stacks;

import java.util.Scanner;
import java.util.Stack;

public class EvalPostFix {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		char exp[] = sc.next().toCharArray();
		for (char e : exp) {
			if (Character.isDigit(e)) {
				stack.push(Character.getNumericValue(e));
			} else {
				int var1 = stack.pop();
				int var2 = stack.pop();
				switch (e) {
				case '+':
					stack.push((var1 + var2));
					break;
				case '-':
					stack.push((var1 - var2));
					break;
				case '*':
					stack.push((var1 * var2));
					break;
				case '/':
					stack.push((var1 / var2));
					break;
				}

			}
		}
		System.out.println("" + stack.peek());

	}

}
