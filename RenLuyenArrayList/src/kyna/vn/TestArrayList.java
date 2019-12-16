package kyna.vn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TestArrayList {

	static List<Integer> dsData=new ArrayList<>();
	public static void menu() {
		System.out.println("1.Thêm");
		System.out.println("2.Xuất");
		System.out.println("3.Sửa");
		System.out.println("4.Xóa");
		System.out.println("5.Tìm kiếm");
		System.out.println("6.Sắp xếp");
		System.out.println("7.Thoát");
		System.out.println("Bạn chọn gì?:");
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
				SapXep();
				break;
			case 7:
				System.out.println("Cảm ơn bạn!");
				System.exit(0);
			default:
				System.err.println("Bạn nhập lụi rồi!");
				break;
			}
	}
	private static void SapXep() {
		Collections.sort(dsData);
	}
	private static void TimKiem() {
		System.out.println("Nhập số cần tìm:");
		int k=new Scanner(System.in).nextInt();
		if(dsData.contains(k)) {
			System.out.println("Có "+k+" trong danh sách");
		} else {
			System.out.println("Không có "+k+" trong danh sách");
		}
	}
	private static void Xoa() {
		System.out.println("Vị trí muốn xóa:");
		int vt=new Scanner(System.in).nextInt();
		dsData.remove(vt);
	}
	private static void Sua() {
		System.out.println("Vị trí muốn sửa:");
		int vt=new Scanner(System.in).nextInt();
		System.out.println("Giá trị mới:");
		int value=new Scanner(System.in).nextInt();
		dsData.set(vt, value);
	}
	private static void Xuat() {
		for(int i=0;i<dsData.size();i++) {
			System.out.print(dsData.get(i)+"\t");
		}
		System.out.println();
	}
	private static void Them() {
		System.out.println("Nhập giá trị muốn thêm:");
		int value=new Scanner(System.in).nextInt();
		dsData.add(value);
	}
	public static void main(String[] args) {
		while(true) {
			menu();
		}
	}

}
