package dsa;

import java.util.Stack;

public class ValidParenthesis {
	
	public static boolean validPranthesis(String s) {
		
		Stack<Character>stack = new Stack<>();
		
		char[]character = s.toCharArray();
		
		for(char i:character) {
			
			if(i=='('||i=='{'||i=='[') {
				stack.push(i);
			}
			else if(!stack.empty()&&stack.peek()=='('&& i==')') {
				stack.pop();
			}
			else if(!stack.empty()&&stack.peek()=='{'&& i=='}') {
				stack.pop();
			}
			else if(!stack.empty()&&stack.peek()=='['&& i==']') {
				stack.pop();
			}
			else {
				return false;
			}
			
		}
		
		return stack.empty();
		
	}
	public static void main(String[] args) {
		
		System.out.println(validPranthesis("()[]{"));
		
	}

}
