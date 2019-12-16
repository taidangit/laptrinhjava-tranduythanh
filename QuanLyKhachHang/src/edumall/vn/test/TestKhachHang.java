package edumall.vn.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import edumall.vn.io.FileFactory;
import edumall.vn.model.KhachHang;

public class TestKhachHang {

	static ArrayList<KhachHang> dsKh=new ArrayList<>();
	public static void menu() {
		System.out.println("1.Nhập khách hàng");
		System.out.println("2.Xuất khách hàng");
		System.out.println("3.Tìm kiếm khách hàng");
		System.out.println("4.Sắp xếp khách hàng");
		System.out.println("5.Lưu khách hàng");
		System.out.println("6.Đọc khách hàng");
		System.out.println("7.Thống kê theo nhà mạng");
		System.out.println("8.Thoát");
		System.out.println("Bạn chọn chức năng[1..8]:");
		int chon=new Scanner(System.in).nextInt();
		switch (chon) {
		case 1:
			Nhap();
			break;
		case 2:
			Xuat();
			break;
		case 3:
			TimKiem();
			break;
		case 4:
			SapXep();
			break;
		case 5:
			Luu();
			break;
		case 6:
			Doc();
			break;
		case 7:
			ThongKe();
			break;
		case 8:
			System.out.println("Cảm ơn bạn đã sử dụng phần mềm!");
			System.exit(0);
			break;
		default:
			break;
		}
	}
	private static void ThongKe() {
		int n=0;
		for(KhachHang kh : dsKh) {
			if(kh.getPhone().startsWith("098")) {
				n++;
			}
		}
		System.out.println("Có "+n+" khách hàng Viettle");
	}
	private static void Doc() {
		dsKh=FileFactory.readFile("E:/dataKH.dat");
		System.out.println("Đã đọc file thành công");
	}
	private static void Luu() {
		boolean kq=FileFactory.saveFile(dsKh, "E:/dataKH.dat");
		if(kq)  {
			System.out.println("Lưu file thành công");
		} else {
			System.out.println("Lưu file thất bại");
		}
	}
	private static void SapXep() {
		Collections.sort(dsKh);
	}
	private static void TimKiem() {
		System.out.println("Nhập đầu số cần tìm:");
		String phone=new Scanner(System.in).nextLine();
		System.out.println("Khách hàng có đầu số "+phone);
		System.out.println("Mã\tTên\tPhone");
		for(KhachHang kh : dsKh) {
			if(kh.getPhone().startsWith(phone)) {
				System.out.println(kh);
			}
		}
	}
	private static void Xuat() {
		System.out.println("Danh sách khách hàng:");
		System.out.println("Mã\tTên\tPhone");
		for(KhachHang kh : dsKh) {
			System.out.println(kh);
		}
	}
	private static void Nhap() {
		System.out.println("Nhập mã:");
		int ma=new Scanner(System.in).nextInt();
		System.out.println("Nhập tên:");
		String ten=new Scanner(System.in).nextLine();
		System.out.println("Nhập phone:");
		String phone=new Scanner(System.in).nextLine();
		
		KhachHang kh=new KhachHang(ma, ten, phone);
		dsKh.add(kh);
		
	}
	public static void main(String[] args) {
		while(true) {
			menu();
		}
	}

}
