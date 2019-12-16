package kyna.vn;

public class TestDoiChuoi {

	public static void main(String[] args) {
		String s="Xin chào Obama!Tui là Putin";
		s=s.replace("Obama", "Kim Jong Un");
		System.out.println(s);
		
		String s1="Obama xin chào Michelle Obama";
		s=s1.replaceFirst("Obama", "Putin");
		System.out.println(s);
		
		String s2="Obama xin chào Michelle Obama";
		s=s2.replace("Obama", "Putin");
		System.out.println(s);
	}

}
