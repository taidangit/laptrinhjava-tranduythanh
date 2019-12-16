package kyna.vn.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import kyna.vn.model.SanPham;

public class TestSanPham {

	public static void main(String[] args) {
		List<SanPham> dsSp=new ArrayList<>();
		dsSp.add(new SanPham(1, "Pepsi", 25));
		dsSp.add(new SanPham(2, "Coca", 15));
		dsSp.add(new SanPham(3, "Redbull", 20));
		System.out.println("Danh sách sản phẩm:");
		for(SanPham sp : dsSp) {
			System.out.println(sp);
		}
		Collections.sort(dsSp);
		System.out.println("Danh sách sản phẩm sau khi sort:");
		for(SanPham sp : dsSp) {
			System.out.println(sp);
		}
	}

}
