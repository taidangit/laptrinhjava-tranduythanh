package kyna.vn;

public class TestFor_Hinh2 {

	public static void Hinh5(int n) {
		for(int i=0; i<n; i++)  {
			for(int j=0; j<n; j++) {
				if(i+j==n-1 || j==n/2 || (i==0 && j>=n/2) || (i==n-1 && j<=n/2)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Hinh5(11);
	}

}
