package kyna.vn.test;

import kyna.vn.model.NhanVien;

public class TestNhanVien {

	public static void main(String[] args) {
		NhanVien nv1=new NhanVien(1, "Obama");
		NhanVien nv2=new NhanVien(2, "Putin");
		nv1=nv2;
		nv2.setTen("Kim Jong un");
		System.out.println("Tên của nhân viên 1="+nv1.getTen());
		nv1.setTen("Hồ Cẩm Đào");
		System.out.println("Tên của nhân viên 2="+nv2.getTen());
		
		NhanVien nv3=new NhanVien(3, "Ông Tài");
		NhanVien nv4=new NhanVien(4, "Ông Thanh");
		nv3=nv4.copy();
		System.out.println("Tên nhân viên 3="+nv3.getTen());
		nv4.setTen("Tèo");
		System.out.println("Tên nhân viên 3="+nv3.getTen());
		nv3.setTen("Alibaba");
		System.out.println("Tên nhân viên 4="+nv4.getTen());


	}

}
