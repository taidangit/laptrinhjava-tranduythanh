package kyna.vn.test;

import java.util.ArrayList;
import java.util.List;

import kyna.vn.model.SinhVien;

public class TestSinhVien {

	public static void main(String[] args) {
		List<SinhVien> dsSv=new ArrayList<>();
		dsSv.add(new SinhVien(1, "Tèo", 6));
		dsSv.add(new SinhVien(2, "Tý", 9));
		dsSv.add(new SinhVien(3, "Bin", 2));
		dsSv.add(new SinhVien(4, "Bo", 7));
		System.out.println("Danh sách sinh viên:");
		for(SinhVien sv:dsSv) {
			System.out.println(sv);
		}
	}

}
