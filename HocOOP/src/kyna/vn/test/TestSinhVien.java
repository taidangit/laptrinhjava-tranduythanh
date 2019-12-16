package kyna.vn.test;

import kyna.vn.model.SinhVien;

public class TestSinhVien {

	public static void main(String[] args) {
		SinhVien obama=new SinhVien();
		SinhVien putin=new SinhVien("Ông Putin", 8);
		System.out.println("Điểm Putin="+putin.getDiem());
		System.out.println("Tên của Putin="+putin.getHoTen());
		
		System.out.println("Tên của Obama="+obama.getHoTen());
		obama.setHoTen("Ông Obama");
		System.out.println("Tên của Obama="+obama.getHoTen());

		System.out.println("----------------------------------");
		putin.xuatThongTin();
		
		System.out.println("----------------------------------");
		System.out.println(putin);
	}

}
