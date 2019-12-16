package kyna.vn.test;

import kyna.vn.model.HinhChuNhat;
import kyna.vn.model.HinhHoc;
import kyna.vn.model.HinhVuong;

public class TestHinhHoc {

	public static void main(String[] args) {
		HinhHoc h;
		h=new HinhChuNhat(4, 5);
		System.out.println("Chu vi="+h.tinhChuVi());
		System.out.println("Diện tích="+h.tinhDienTich());
		
		h=new HinhVuong(5);
		System.out.println("Chu vi="+h.tinhChuVi());
		System.out.println("Diện tích="+h.tinhDienTich());
		System.out.println("-----------------------------");
		HinhChuNhat hcn=new HinhVuong(5);
		System.out.println("Chu vi="+hcn.tinhChuVi());
		System.out.println("Diện tích="+hcn.tinhDienTich());
	}

}
