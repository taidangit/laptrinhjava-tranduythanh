package kyna.vn.test;

import kyna.vn.model.NhanVienChinhTHuc;
import kyna.vn.model.NhanVienThoiVu;

public class TestNhanVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhanVienChinhTHuc teo=new NhanVienChinhTHuc(1, "Tèo");
		teo.tinhLuong();
		NhanVienThoiVu ty=new NhanVienThoiVu(2, "Tý");
		ty.tinhLuong();
		
	}

}
