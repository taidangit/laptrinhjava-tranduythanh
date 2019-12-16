package kyna.vn;

import java.util.Scanner;

public class TestWhile {

	public static void main(String[] args) {
		System.out.println("Nhập 1 số:");
		int n=new Scanner(System.in).nextInt();
		int gt=1;
		int i=1;
		while(i<=n) {
			gt*=i;
			i++;
		}
		System.out.println(n+"! = "+gt);
	}

}
