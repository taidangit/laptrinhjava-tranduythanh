package kyna.vn;

import java.util.Scanner;

public class TestPannydrome {

	public static void main(String[] args) {
		System.out.println("Nhập vào chuỗi:");
		String s=new Scanner(System.in).nextLine();
		char []arr=s.toCharArray();
		boolean flag=true;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=arr[arr.length-i-1]) {
				flag=false;
				break;
			}
		}
		if(flag==true) {
			System.out.println(s+" là chuỗi Pannydrome");
		} else {
			System.out.println(s+" không phải là chuỗi Pannydrome");

		}
	}

}
