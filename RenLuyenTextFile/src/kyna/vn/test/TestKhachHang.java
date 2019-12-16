package kyna.vn.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import kyna.vn.io.FileFactory;
import kyna.vn.model.KhachHang;
import kyna.vn.util.DateConverter;

public class TestKhachHang {

	static List<KhachHang> dsKh=new ArrayList<>();
	public static void menu() {
		System.out.println("1.Nhập");
		System.out.println("2.Xuất");
		System.out.println("3.Lưu");
		System.out.println("4.Đọc");
		System.out.println("5.Thoát");
		System.out.println("Bạn chọn gì:");
		int chon=new Scanner(System.in).nextInt();
		switch (chon) {
			case 1:
				Nhap();
				break;
			case 2:
				Xuat();
				break;
			case 3:
				Luu();
				break;
			case 4:
				Doc();
				break;
			case 5:
				System.out.println("Bye Bye!");
				System.exit(0);
	
			default:
				System.err.println("Nhập lụi rồi!");
				break;
			}
	}
	private static void Doc() {
		dsKh=FileFactory.readFile("E:/dulieuKH.txt");
		for(KhachHang kh:dsKh) {
			System.out.println(kh);
		}
	}
	private static void Luu() {
		boolean kq=FileFactory.saveFile(dsKh, "E:/dulieuKH.txt");
		if(kq) {
			System.out.println("Lưu thành công");
		} else {
			System.out.println("Lưu thất bại");
		}
	}
	private static void Xuat() {
		for(KhachHang kh : dsKh) {
			System.out.println(kh);
		}
	}
	private static void Nhap() {
		System.out.println("Nhập mã:");
		int ma=new Scanner(System.in).nextInt();
		System.out.println("Nhập tên:");
		String ten=new Scanner(System.in).nextLine();
		System.out.println("Nhập năm sinh(dd/MM/yyyy):");
		Date ns=DateConverter.fromString(new Scanner(System.in).nextLine());
		
		KhachHang kh=new KhachHang(ma,ten,ns);
		dsKh.add(kh);
	}
	public static void main(String[] args) {
		while(true) {
			menu();
		}
	}

}
