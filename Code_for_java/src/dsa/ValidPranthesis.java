package dsa;

import java.util.Stack;

public class ValidPranthesis {
	
	public static boolean validParaenthesis(String string) {
		
		Stack<Character> stack = new Stack<>();
		
		int len = string.length();
		for(int i=0; i<len;i++) {
			char c = string.charAt(i);
			
			if(c=='('||c=='{'||c=='[') {
				stack.push(c);
			}
			else {
				if(!stack.empty()&& c==')'&& stack.peek()=='(') {
					stack.pop();	
				}
				else if(!stack.empty()&& c=='}'&& stack.peek()=='{'){
					stack.pop();
				}
				else if(!stack.empty()&& c==']'&& stack.peek()=='[') {
					stack.pop();
				}
				else {
					return false;
					
				}
			}
		}
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		
		String p = "[{))";
		boolean flag=validParaenthesis(p);
		System.out.println(flag);
	}
	

}
