package kyna.vn;

import java.util.Scanner;

public class TestIfElse {

	public static void main(String[] args) {
		System.out.println("Nhập 1 tháng:");
		int t=new Scanner(System.in).nextInt();
		if(t==1||t==3||t==5||t==7||t==8||t==10||t==12) {
			System.out.println("Tháng "+t+" có 31 ngày");
		} else if(t==4||t==6||t==9||t==11) {
			System.out.println("Tháng "+t+" có 30 ngày");
		} else if(t==2) {
			System.out.println("Tháng "+t+" có 29 hoặc 28 ngày");
		} else {
			System.out.println("Bạn nhập tháng "+t+" lụi rồi");
		}
	}

}
