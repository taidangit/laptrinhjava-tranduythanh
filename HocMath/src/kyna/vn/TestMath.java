package kyna.vn;

import java.util.Scanner;

public class TestMath {

	public static void main(String[] args) {
		System.out.println("PI="+Math.PI);
		int min=Math.min(9, 10);
		System.out.println("Min="+min);
		double can=Math.sqrt(25);
		System.out.println("Căn bậc 2 của 25="+can);
		int gttd=Math.abs(-4);
		System.out.println("|-4|="+gttd);
		double lt=Math.pow(3, 4);
		System.out.println("3^4="+lt);
		System.out.println("Nhập 1 góc:");
		int goc=new Scanner(System.in).nextInt();
		double rad=Math.PI*goc/180;
		double sin=Math.sin(rad);
		double cos=Math.cos(rad);
		double tan=Math.tan(rad);
		double cotan=1/tan;
		System.out.println("Sin("+goc+")="+sin);
		System.out.println("Cos("+goc+")="+cos);
		System.out.println("tan("+goc+")="+tan);
		System.out.println("cotan("+goc+")="+cotan);
	}

}
