package kyna.vn;

import java.util.Scanner;

public class TestFor {

	public static double TinhS(int n, int x) {
		double s=0.0;
		int mau=0;
		for(int i=1; i<=n; i++) {
			double tu=Math.pow(x, i);
			mau+=i;
			s+=tu/mau;
		}
		return s;
	}
	public static void main(String[] args) {
		System.out.println("Nhập x:");
		int x=new Scanner(System.in).nextInt();
		System.out.println("Nhập n:");
		int n=new Scanner(System.in).nextInt();
		double s=TinhS(n, x);
		System.out.println("S("+x+","+n+")="+s);
		
	}

}
