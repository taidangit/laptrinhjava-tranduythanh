package kyna.vn.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import kyna.vn.io.FileFactory;
import kyna.vn.model.DanhBa;

public class TestDanhBa {

	static List<DanhBa> dsDb=new ArrayList<>();
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
		dsDb=FileFactory.readFile("E:/danhba.dat");
		for(DanhBa db:dsDb) {
			System.out.println(db);
		}
	}
	private static void Luu() {
		boolean kq=FileFactory.saveFile(dsDb, "E:/danhba.dat");
		if(kq) {
			System.out.println("Lưu thành công");
		} else {
			System.out.println("Lưu thất bại");
		}
	}
	private static void Xuat() {
		System.out.println("Danh sách danh bạ:");
		for(DanhBa db:dsDb) {
			System.out.println(db);
		}
	}
	private static void Nhap() {
		System.out.println("Nhập tên:");
		String ten=new Scanner(System.in).nextLine();
		System.out.println("Nhập phone:");
		String phone=new Scanner(System.in).nextLine();
		DanhBa db=new DanhBa(ten, phone);
		dsDb.add(db);
	}
	public static void main(String[] args) {
		while(true) {
			menu();
		}
	}

}
