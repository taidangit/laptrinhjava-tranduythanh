package kyna.vn;

import java.util.Scanner;

public class TestFor {

	public static void main(String[] args) {
		System.out.println("Nhập 1 số:");
		int n=new Scanner(System.in).nextInt();
		int gt=1;
		for(int i=1;i<=n;i++) {
			gt*=i;
		}
		System.out.println(n+"! = "+gt);
	}

}
