package kyna.vn;

import java.util.StringTokenizer;

public class TestTimKiem {

	public static void main(String[] args) {
		String s="Công tằng anh nữ nguyễn thị anh long lanh chồng chành anh tuyết";
		int vt1=s.indexOf("ô");
		System.out.println("Tìm thấy [ô] ở vị trí thứ "+vt1);
		int vt2=s.indexOf("anh");
		System.out.println("Tìm thấy [anh] ở vị trí thứ "+vt2);
		int vt3=s.indexOf("long");
		if(vt3==-1) {
			System.out.println("Không tìm thấy long");
		} else {
			System.out.println("Tìm thấy long");
		}
		int vt4=s.lastIndexOf("ô");
		System.out.println("Tìm thấy [ô] ở vị trí thứ "+vt4);
		int vt5=s.lastIndexOf("anh");
		System.out.println("Tìm thấy [anh] ở vị trí thứ "+vt5);

		if(s.contains("ánh")) {
			System.out.println("Có từ [ánh] trong chuỗi");
		} else {
			System.out.println("Không có chữ [ánh] trong chuỗi");
		}
		
		StringTokenizer tokenizer=new StringTokenizer(s);
		int dem=0;
		while(tokenizer.hasMoreTokens()) {
			String value=tokenizer.nextToken();
			if(value.equals("anh")) {
				dem++;
			}
		}
		System.out.println("Có "+dem+" từ [anh]");
	}

}