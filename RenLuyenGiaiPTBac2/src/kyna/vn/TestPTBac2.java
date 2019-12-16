package kyna.vn;

import java.util.Scanner;

public class TestPTBac2 {
	/**
	 * Giải phương trình bậc 2: ax^2+bx+c=0
	 * @param a - hệ số a
	 * @param b - hệ số b
	 * @param c - hệ số c
	 */
	public static void giaiPTB2(double a, double b, double c) {
		if(a==0) {
			System.out.println("Phương trình trở thành bậc 1");
			if(b==0 && c==0) {
				System.out.println("Phương trình vô số nghiệm");
			} else if(b==0 && c!=0) {
				System.out.println("Phương trình vô nghiệm");
			} else {
				System.out.println("Phương trình có nghiệm x="+(-c/b));
			}
		} else {
			double delta=b*b-4*a*c;
			if(delta<0) {
				System.out.println("Phương trình vô nghiệm");
			} else if(delta==0) {
				System.out.println("Phương trình có nghiệm kép x1=x2="+(-b/(2*a)));
			} else {
				double x1=(-b-Math.sqrt(delta))/(2*a);
				double x2=(-b+Math.sqrt(delta))/(2*a);
				System.out.println("Phương trình có 2 nghiệm phân biệt: x1="+x1+", x2="+x2);
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("GIẢI PHƯƠNG TRÌNH BẬC 2");
		while(true) {
			System.out.println("Nhập a:");
			double a=new Scanner(System.in).nextDouble();
			System.out.println("Nhập b:");
			double b=new Scanner(System.in).nextDouble();
			System.out.println("Nhập c:");
			double c=new Scanner(System.in).nextDouble();
			giaiPTB2(a, b, c);
			System.out.println("Tiếp ko?(c/k):");
			String line=new Scanner(System.in).nextLine();
			if(line.equalsIgnoreCase("k")) {
				break;
			}
		}
		System.out.println("Bye Bye!");
		
	}

}
