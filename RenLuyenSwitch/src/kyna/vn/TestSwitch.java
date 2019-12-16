package kyna.vn;

import java.util.Scanner;

public class TestSwitch {

	public static void main(String[] args) {
		while(true) {
			System.out.println("Nhập a:");
			int a=new Scanner(System.in).nextInt();
			System.out.println("Nhập b:");
			int b=new Scanner(System.in).nextInt();
			System.out.println("Nhập phép toán:");
			char ch=new Scanner(System.in).nextLine().charAt(0);
			switch (ch) {
			case '+':
				System.out.println(a+"+"+b+"="+(a+b));
				break;
			case '-':
				System.out.println(a+"-"+b+"="+(a-b));
				break;
			case '*':
				System.out.println(a+"*"+b+"="+(a*b));
				break;
			case '/':
				if(b==0) {
					System.out.println("Mẫu=0");
				}
				else {
					
				}
				System.out.println(a+"/"+b+"="+(a*1.0/b));
				break;
			default:
				System.err.println("Bạn nhập phép toán lụi rồi!");
				break;
			}
			System.out.println("Tiếp ko?(c/k):");
			String line=new Scanner(System.in).nextLine();
			if(line.equalsIgnoreCase("k")) {
				break;
			}
		}
		System.out.println("Bye bye!");
	}

}
