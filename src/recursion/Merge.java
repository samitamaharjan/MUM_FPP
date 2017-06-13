package recursion;

class Merge {
	StringBuilder sb = new StringBuilder();
	public String merge(String left, String right) {
		if(left == null || left.isEmpty()) {
			sb.append(right);
			return sb.toString();
		}
		if(left == null || right.isEmpty()) {
			sb.append(left);
			return sb.toString();
		}
		if(left.charAt(0) <= right.charAt(0)) {
			sb.append(left.charAt(0));
			return merge(left.substring(1), right);
		} else {
			sb.append(right.charAt(0));
			return merge(left, right.substring(1));
		}
	}
	
	public static void main(String[] args) {
		System.out.println(new Merge().merge("szrg", "datp"));
	}
}
