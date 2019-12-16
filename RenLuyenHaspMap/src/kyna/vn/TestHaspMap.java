package kyna.vn;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestHaspMap {

	static Map<Integer, String> map=new HashMap<>();
	public static void menu() {
		System.out.println("1.Thêm");
		System.out.println("2.Xuất");
		System.out.println("3.Sửa");
		System.out.println("4.Xóa");
		System.out.println("5.Tìm kiếm");
		System.out.println("6.Thoát");
		System.out.println("Chọn gì?:");
		int chon=new Scanner(System.in).nextInt();
		switch (chon) {
		case 1:
			Them();
			break;
		case 2:
			Xuat();
			break;
		case 3:
			Sua();
			break;
		case 4:
			Xoa();
			break;
		case 5:
			TimKiem();
			break;
		case 6:
			System.out.println("Cảm ơn bạn!");
			break;
		default:
			System.err.println("Bạn nhập lụi rồi!");
			break;
		}
	}	private static void TimKiem() {
		System.out.println("Nhập tên sách muốn tìm:");
		String ten=new Scanner(System.in).nextLine();
		for(Map.Entry<Integer, String> item : map.entrySet()) {
			if(item.getValue().contains(ten)) {
				System.out.println(item.getKey()+"-"+item.getValue());
				break;
			}
		}
	}
	private static void Xoa() {
		System.out.println("Nhập mã sách cần xóa:");
		int ma=new Scanner(System.in).nextInt();
		if(!map.containsKey(ma)) {
			System.out.println("Không tồn tại mã "+ma+" để xóa");
		} else {
			map.remove(ma);
		}
	}
	private static void Sua() {
		System.out.println("Nhập mã cần sửa:");
		int ma=new Scanner(System.in).nextInt();
		if(!map.containsKey(ma)) {
			System.out.println("Mã "+ma+"  không tồn tại");
		} else {
			System.out.println("Nhập tên sách mới:");
			String ten=new Scanner(System.in).nextLine();
			map.put(ma, ten);
		}
	}
	private static void Xuat() {
		System.out.println("Mã Sách\tTên Sách");
		for(Map.Entry<Integer, String> item : map.entrySet()) {
			System.out.println(item.getKey()+"\t"+item.getValue());
		}
	}
	private static void Them() {
		System.out.println("Nhập mã sách:");
		int ma=new Scanner(System.in).nextInt();
		System.out.println("Nhập tên sách:");
		String ten=new Scanner(System.in).nextLine();
		if(!map.containsKey(ma)) {
			map.put(ma, ten);
		}
	}

	public static void main(String[] args) {
		while(true) {
			menu();
		}
	}

}
