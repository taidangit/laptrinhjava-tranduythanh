package kyna.vn;

public class TestStringBuilder {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		sb.append("Hello ");
		sb.append("Obama ");
		sb.append("Putin");
		sb.insert(5, "xxx");
		System.out.println(sb.toString());
		sb.delete(5, 8);
		System.out.println(sb.toString());
	}

}
