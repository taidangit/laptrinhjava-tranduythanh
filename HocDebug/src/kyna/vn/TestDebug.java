package kyna.vn;

import java.util.Scanner;

public class TestDebug {

	public static void Cong(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		System.out.println("Nhập a:");
		int a=new Scanner(System.in).nextInt();
		System.out.println("Nhập b:");
		int b=new Scanner(System.in).nextInt();
		if(a==0 || b==0) {
			System.out.println("Một trong 2 số =0");
		} else {
			Cong(a, b);
			System.out.println("Ok OK OK!");
		}
	}

}
