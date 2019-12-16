package kyna.vn;

import java.util.Scanner;

public class TestSwitchBienThe {

	public static void main(String[] args) {
		System.out.println("Nhập vào 1 tháng:");
		int t=new Scanner(System.in).nextInt();
		switch (t) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 12:
				System.out.println("Tháng "+t+" có 31 ngày");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("Tháng "+t+" có 30 ngày");
				break;
			case 2:
				System.out.println("Nhập 1 năm:");
				int y=new Scanner(System.in).nextInt();
				if((y%4==0 && y%100!=0) || y%400==0){
					System.out.println("Năm "+y+" nhuần==>Tháng "+t+" có 29 ngày");
				}
				else{
					System.out.println("Năm "+y+" không nhuần==>Tháng "+t+" có 28 ngày");
				}
				break;
			default:
				System.err.println("Bạn nhập tháng "+t+" lụi rồi!");
				break;
			}
	}

}
