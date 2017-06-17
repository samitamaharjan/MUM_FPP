package collection.lesson9_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SymbolBalancer {
	String filename;
	String text;
	String expression = "[](){}";
	
	public SymbolBalancer(String filename) {
		this.filename = filename;
		readFile();
	}
	
	public boolean symbolsBalanced(String delimiters) {
		MyStringStackSingly stack = new MyStringStackSingly();
		char ch, chx;
		boolean flag = false;
		int n = text.length();
		for (int i = 0; i < n; i++) {
			ch = text.charAt(i);
			if (ch == '[' || ch == '{' || ch == '(') {
				stack.push(String.valueOf(ch));
				if (ch == ']' || ch == '}' || ch == ')') {
					if (stack.isEmpty()) return false;
					else {
						chx = stack.pop().charAt(0);
						if (chx == '[' && ch == ']') {
							flag = true;
						} else if (chx == '{' && ch == '}') {
							flag = true;
						} else if (chx == '(' && ch == ')') {
							flag = true;
						} else 
							return false;
					}
				}
			}
		}
		if (!stack.isEmpty()) flag = false;
		return flag;
	}
	
	public boolean openBracket(char ch) {
		for (int i = 0; i < expression.length(); i = i + 2) {
			if (ch == expression.charAt(i)) return true;
		}
		return false;
	}
	
	public boolean closedBracket(char ch) {
		for (int i = 1; i < expression.length(); i = i + 2) {
			if (ch == expression.charAt(i)) return true;
		}
		return false;
	}
	
	public void readFile() {
		try (BufferedReader br = 
		new BufferedReader(new FileReader(filename))) {
			String currentLine;
			StringBuilder builder = new StringBuilder();
			while ((currentLine = br.readLine()) != null) {
				builder.append(currentLine);
			}
			text = builder.toString();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
