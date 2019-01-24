package com.easy;

import java.util.EmptyStackException;
import java.util.Stack;

public class ValidParentheses {

	
	    public static boolean isValid(String s) throws EmptyStackException{
	     Stack<Character> st = new Stack<Character>();
			try {
			for (int i = 0; i < s.length(); i++) {
				if((s.charAt(i)=='(') || (s.charAt(i)=='{') || (s.charAt(i)=='['))
				st.push(s.charAt(i));
				else{
					
					if ((s.charAt(i)==')') && (st.peek()=='(')) {
						st.pop();
					}
					else if ((s.charAt(i)=='}') && (st.peek()=='{')) {
						st.pop();
					}
					else if ((s.charAt(i)==']') && (st.peek()=='[')) {
						st.pop();
					}
				}
			}
	            } catch (Exception e) {
				return false;
			}
			if(st.empty())
				return true;
			else
				return false;   
	    }
	

	public static void main(String[] args) {

		boolean ans = isValid("]");
		System.out.println(ans);
	}

}
