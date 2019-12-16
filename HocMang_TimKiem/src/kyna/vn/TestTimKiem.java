package kyna.vn;

import java.util.Scanner;

public class TestTimKiem {

	public static void NhapMang(int M[]) {
		for(int i=0;i<M.length;i++) {
			System.out.print("M["+i+"]=");
			M[i]=new Scanner(System.in).nextInt();
		}
	}
	public static void XuatMang(int M[]) {
		for(int i=0;i<M.length;i++) {
			System.out.print(M[i]+"\t");
		}
	}
	public static void TimPhanTu(int M[], int k) {
		boolean timThay=false;
		for(int i=0;i<M.length;i++) {
			if(M[i]==k) {
				timThay=true;
				break;
			}
		}
		if(timThay==true) {
			System.out.println("Tìm thấy "+k+" trong mảng");
		} else {
			System.out.println("Không tìm thấy "+k+" trong mảng");

		}
	}
	public static void TimSoLanXuatHienPhanTu(int M[], int k) {
		int dem=0;
		String s="";
		for(int i=0;i<M.length;i++) {
			if(M[i]==k) {
				s+=i+",";
				dem++;
			}
		}
		if(s.length()>0) {
			System.out.println("Tìm thấy "+k+" xuất hiệm "+dem+" lần");
			System.out.println("Các vị trí:"+s);
		} else {
			System.out.println("Không tìm thấy "+k);
		}
	}
	public static void main(String[] args) {
		System.out.println("Nhập số phần tử của mảng:");
		int n=new Scanner(System.in).nextInt();
		int []M=new int[n];
		System.out.println("Nhập giá trị cho mảng:");
		NhapMang(M);
		System.out.println("Mảng sau khi nhập:");
		XuatMang(M);
		System.out.println("Nhập số tìm:");
		int k=new Scanner(System.in).nextInt();
		TimPhanTu(M, k);
		System.out.println("\nNhập số tìm:");
		int x=new Scanner(System.in).nextInt();
		TimSoLanXuatHienPhanTu(M, x);
	}

}
