package kyna.vn;

public class TestSubString {

	public static void main(String[] args) {
		String s="Xin chào Obama! Putin đây!";
		String s1=s.substring(16);
		System.out.println(s1);
		String s2=s.substring(9, 14);
		System.out.println(s2);
		String s3=s.substring(0, 7);
		System.out.println(s3);
	}

}
