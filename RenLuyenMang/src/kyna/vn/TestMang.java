package kyna.vn;

import java.util.Random;
import java.util.Scanner;

public class TestMang {
	static int M[];
	public static void menu() {
		System.out.println("1.Nhập mảng");
		System.out.println("2.Xuất mảng");
		System.out.println("3.Tính tổng mảng");
		System.out.println("4.Tìm kiếm");
		System.out.println("5.Lớn nhất");
		System.out.println("6.Nhỏ nhất");
		System.out.println("7.Số nguyên tố");
		System.out.println("8.Sắp tăng");
		System.out.println("9.Sắp giảm");
		System.out.println("-1.Thoát");
		System.out.println("Bạn chọn gì?:");
		int chon=new Scanner(System.in).nextInt();
		switch (chon) {
			case 1:
				NhapMang();
				break;
			case 2:
				XuatMang();
				break;
			case 3:
				TinhTong();
				break;
			case 4:
				TimKiem();
				break;
			case 5:
				TimMax();
				break;
			case 6:
				TimMin();
				break;
			case 7:
				SoNguyenTo();
				break;
			case 8:
				SapTang();
				break;
			case 9:
				SapGiam();
				break;
			case -1:
				System.out.println("Cảm ơn bạn!");
				System.exit(0);
			default:
				System.err.println("Nhập lụi rồi!");
				break;
			}
	}
	private static void SapGiam() {
		for(int i=0;i<M.length-1;i++)  {
			for(int j=i+1; j<M.length;j++) {
				if(M[i]<M[j]) {
					int temp=M[i];
					M[i]=M[j];
					M[j]=temp;
				}
			}
		}
	}
	private static void SapTang() {
		for(int i=0;i<M.length-1;i++)  {
			for(int j=i+1; j<M.length;j++) {
				if(M[i]>M[j]) {
					int temp=M[i];
					M[i]=M[j];
					M[j]=temp;
				}
			}
		}
	}
	private static void SoNguyenTo() {
		System.out.println("Các số nguyên tố:");
		for(int i=0;i<M.length;i++) {
			int dem=0;
			for(int j=1;j<=M[i];j++) {
				if(M[i]%j==0) {
					dem++;
				}
			}
			if(dem==2) {
				System.out.print(M[i]+"\t");
			}
		}
		System.out.println();
	}
	private static void TimMin() {
		int min=M[0];
		for(int i=0;i<M.length;i++) {
			if(M[i]<min) {
				min=M[i];
			}
		}
		System.out.println("Số nhỏ nhất="+min);
	}
	private static void TimMax() {
		int max=M[0];
		for(int i=0;i<M.length;i++) {
			if(M[i]>max) {
				max=M[i];
			}
		}
		System.out.println("Số lớn nhất="+max);
	}
	private static void TimKiem() {
		int dem=0;
		String s="";
		System.out.println("Nhập số cần tìm:");
		int k=new Scanner(System.in).nextInt();
		for(int i=0;i<M.length;i++) {
			if(M[i]==k) {
				dem++;
				s+=i+",";
			}
		}
		if(s.length()>0) {
			System.out.println("Thấy "+k+" xuất hiện "+dem+" trong mảng");
			System.out.println("Các vị trí:"+s);
		} else {
			System.out.println("Không thấy "+k+" trong mảng");
		}
	}
	private static void TinhTong() {
		int sum=0;
		for(int x : M) {
			sum+=x;
		}
		System.out.println("Tổng mảng="+sum);
	}
	private static void XuatMang() {
		System.out.println("Mảng sau khi nhập:");
		for(int i=0;i<M.length;i++) {
			System.out.print(M[i]+"\t");
		}
		System.out.println();
	}
	private static void NhapMang() {
		System.out.println("Nhập n:");
		int n=new Scanner(System.in).nextInt();
		M=new int[n];
		Random rd=new Random();
		for(int i=0;i<n;i++) {
			M[i]=rd.nextInt(100);
		}
	}
	public static void main(String[] args) {
		while(true) {
			menu();
		}
	}

}