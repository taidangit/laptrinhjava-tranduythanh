package kyna.vn;

public class TestChuoi {

	public static void main(String[] args) {
		String s1=new String();
		String s2=new String("Obama");
		String s3="Obama";
		System.out.println("Chiều dài s1="+s1.length());
		System.out.println("Chiều dài s2="+s2.length());
		System.out.println("Chiều dài s3="+s3.length());
		if(s2==s3) {
			System.out.println("s2 = s3");
		} else {
			System.out.println("s2 # s3");
		}
		if(s2.equals(s3)) {
			System.out.println("Giá trị s2=s3");
		} else {
			System.out.println("Giá trị s2#s3");
		}

	}

}
