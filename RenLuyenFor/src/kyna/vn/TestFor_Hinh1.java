package kyna.vn;

public class TestFor_Hinh1 {

	public static void Hinh1(int n) {
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Hinh1(5);
	}

}
