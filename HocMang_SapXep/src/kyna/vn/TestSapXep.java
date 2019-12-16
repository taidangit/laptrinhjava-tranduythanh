package kyna.vn;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TestSapXep {

	public static void NhapMang(int M[]) {
		Random rd=new Random();
		for(int i=0;i<M.length;i++) {
			M[i]=rd.nextInt(100);
		}
	}
	public static void XuatMang(int M[])  {
		for(int i=0;i<M.length;i++) {
			System.out.print(M[i]+"\t");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Nhập n:");
		int n=new Scanner(System.in).nextInt();
		int M[]=new int[n];
		NhapMang(M);
		System.out.println("Mảng sau khi nhập:");
		XuatMang(M);
		Arrays.sort(M);
		System.out.println("\nMảng sau khi sắp xếp:");
		XuatMang(M);
	}

}
