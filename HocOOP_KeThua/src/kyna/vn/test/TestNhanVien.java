package kyna.vn.test;

import kyna.vn.model.NhanVienChinhThuc;
import kyna.vn.model.NhanVienThoiVu;

public class TestNhanVien {

	public static void main(String[] args) {
		NhanVienChinhThuc teo=new NhanVienChinhThuc(1, "Tèo");
		NhanVienThoiVu ty=new NhanVienThoiVu(2, "Tý");
		
		teo.tinhLuong();
		ty.tinhLuong();
	}

}
