package Lesson4;

public class MyTable {
	private Entry[] entries = new Entry[26];
	
	//returns the String that is matched with char c in the table
	public String get(char c){
		for (Entry entry : entries) {
			if (c == entry.getCh()) {
				return entry.getStr();
			}
		}
		return null;
	}
	
	//adds to the table a pair (c, s) so that s can be looked up using c 
	public void add(char c, String s) {
		int index = c - 'a';
		entries[index] = new Entry(s, c);
	}
	
	//returns a String consisting of nicely formatted display
	//of the contents of the table
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Entry entry : entries) {
			if (entry != null) {
				sb.append(entry.toString()).append("\n");
			}
		}
		return sb.toString();
	}
	
	private class Entry {
		private String str;
		private char ch;
		
		Entry(String str, char ch){
			this.str = str;
			this.ch = ch;
		}
				
		public String getStr() {
			return str;
		}

		public char getCh() {
			return ch;
		}

		//returns a String of the form "ch->str" 
		public String toString() {
			return String.format("%c -> %s", this.ch, this.str);
		}
	}
}
