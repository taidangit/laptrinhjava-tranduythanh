package kyna.vn;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời bạn nhập 1 số:");
		int a=sc.nextInt();
		System.out.println("Bạn vừa nhập:"+a);
		System.out.println("Mời bạn nhập số double:");
		double b=sc.nextDouble();
		System.out.println("Bạn nhập số:"+b);
		System.out.println("Mời bạn nhấp chuỗi:");
		String line=new Scanner(System.in).nextLine();
		System.out.println("Bạn nhập chuỗi:"+line);
	}

}
