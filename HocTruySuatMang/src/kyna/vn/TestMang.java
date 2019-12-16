package kyna.vn;

import java.util.Scanner;

public class TestMang {

	public static void main(String[] args) {
		int []M;
		System.out.println("Nhập số phần tử mảng:");
		int n=new Scanner(System.in).nextInt();
		M=new int[n];
		System.out.println("Nhập giá trị cho mảng:");
		for(int i=0;i<M.length;i++) {
			System.out.print("M["+i+"]=");
			M[i]=new Scanner(System.in).nextInt();
		}
		System.out.println("Mảng sau khi nhập là:");
		for(int i=0;i<M.length;i++) {
			System.out.print(M[i]+"\t");
		}
		System.out.println("\nXuất mảng theo giá trị:");
		for(int i : M) {
			System.out.print(i+"\t");
		}
		M[2]=113;
		System.out.println("\nMảng sau khi nhập là:");
		for(int i=0;i<M.length;i++) {
			System.out.print(M[i]+"\t");
		}
	}

}
