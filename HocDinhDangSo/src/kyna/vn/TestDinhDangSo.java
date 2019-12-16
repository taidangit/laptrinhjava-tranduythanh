package kyna.vn;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TestDinhDangSo {

	public static void main(String[] args) {
		System.out.println("Nhập điểm toán:");
		double toan=new Scanner(System.in).nextDouble();
		System.out.println("Nhập điểm lý:");
		double ly=new Scanner(System.in).nextDouble();
		System.out.println("Nhập điểm hóa:");
		double hoa=new Scanner(System.in).nextDouble();
		double dtb=(toan+ly+hoa)/3;
		System.out.println("DTB="+dtb);
		
		DecimalFormat dcf=new DecimalFormat("#.##");
		System.out.println("DTB="+dcf.format(dtb));
	}

}
