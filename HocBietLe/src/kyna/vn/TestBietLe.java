package kyna.vn;

public class TestBietLe {

	public static void giaiPTB2(int a, int b, int c) {
		double delta=b*b-4*a*c;
		if(delta<0) {
			System.out.println("PT vô nghiệm");
		} else if(delta>0) {
			System.out.println("PT có 2 nghiệm phân biệt");
		} else {
			System.out.println("PT có nghiệm kép");
		}
	}
	public static void main(String[] args) {
		/*int x, y, z;
		x=5;
		y=x+3;
		
		x=3/5;
		z=8/x;
		System.out.println("z="+z);*/
		giaiPTB2(1, -4, 4);
	}

}
