package kyna.vn.test;

import java.util.Scanner;

import kyna.vn.model.NhanVien;

public class TestNhanVien {

	public static void main(String[] args) {
		NhanVien nv1, nv2;
		System.out.println("Nhập thông tin nhân viên 1:");
		System.out.println("Nhập họ:");
		String ho1=new Scanner(System.in).nextLine();
		System.out.println("Nhập tên:");
		String ten1=new Scanner(System.in).nextLine();
		System.out.println("Nhập số sản phẩm:");
		int soSP1=new Scanner(System.in).nextInt();
		nv1=new NhanVien(ho1, ten1, soSP1);
		
		System.out.println("Nhập thông tin nhân viên 2:");
		System.out.println("Nhập họ:");
		String ho2=new Scanner(System.in).nextLine();
		System.out.println("Nhập tên:");
		String ten2=new Scanner(System.in).nextLine();
		System.out.println("Nhập số sản phẩm:");
		int soSP2=new Scanner(System.in).nextInt();
		nv2=new NhanVien(ho2, ten2, soSP2);
		
		System.out.println("Lương của nhân viên 1="+nv1.getLuong());
		System.out.println("Lương của nhân viên 2="+nv2.getLuong());
		
		/*if(nv1.lonHon(nv2)) {
			System.out.println("Nhân viên ["+nv1.getHo()+" "+nv1.getTen()+"] có nhiều số sản phầm hơn");
			System.out.println("Cụ thể:"+(nv1.getSoSP()-nv2.getSoSP())+" sản phẩm");
		} else {
			System.out.println("Nhân viên ["+nv2.getHo()+" "+nv2.getTen()+"] có nhiều số sản phầm hơn");
			System.out.println("Cụ thể:"+(nv2.getSoSP()-nv1.getSoSP())+" sản phẩm");
		}*/
		
		if(nv1.getSoSP() > nv2.getSoSP()) {
			System.out.println("Nhân viên ["+nv1.getHo()+" "+nv1.getTen()+"] có nhiều số sản phầm hơn");
			System.out.println("Cụ thể:"+(nv1.getSoSP()-nv2.getSoSP())+" sản phẩm");
		} else {
			System.out.println("Nhân viên ["+nv2.getHo()+" "+nv2.getTen()+"] có nhiều số sản phầm hơn");
			System.out.println("Cụ thể:"+(nv2.getSoSP()-nv1.getSoSP())+" sản phẩm");
		}
	}

}
