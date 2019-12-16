package kyna.vn;

import java.util.Scanner;

public class TestDoWhile {

	public static void main(String[] args) {
		System.out.println("Nhập 1 số:");
		int n=new Scanner(System.in).nextInt();
		int gt=1;
		int i=1;
		do {
			gt*=i;
			i++;
		} while(i<=n);
		System.out.println(n+"! = "+gt);
	}

}
