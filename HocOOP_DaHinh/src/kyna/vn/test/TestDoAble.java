package kyna.vn.test;

import kyna.vn.model.IDoAble;
import kyna.vn.model.NhanVien;
import kyna.vn.model.SinhVien;

public class TestDoAble {

	public static void main(String[] args) {
		IDoAble x;
		x=new NhanVien();
		x.doSomething();
		
		x=new SinhVien();
		x.doSomething();
	}

}
