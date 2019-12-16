package kyna.vn.test;

import kyna.vn.model.TamGiac;

public class TestTamGiac {

	public static void main(String[] args) {
		TamGiac tg1=new TamGiac(20,12,25);
		System.out.println("Chu vi="+tg1.tinhChuVi());
		System.out.println("Diện tích="+tg1.tinhDienTich());
	}

}
