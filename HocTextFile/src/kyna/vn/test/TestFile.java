package kyna.vn.test;

import java.util.ArrayList;
import java.util.List;

import kyna.vn.io.FileFactory;

public class TestFile {

	public static void main(String[] args) {
		/*List<String> dsData=new ArrayList<>();
		dsData.add("Obama");
		dsData.add("Putin");
		dsData.add("Kim Jong Un");
		dsData.add("Đặng Phát Tài");
		boolean kq=FileFactory.luuFile(dsData, "E:/dulieutest.txt");
		if(kq) {
			System.out.println("Lưu file thành công");
		} else {
			System.out.println("Lưu file thất bại");
		}*/
		
		List<String>  dsData=FileFactory.docFile("E:/dulieutest.txt");
		for(String data:dsData) {
			System.out.println(data);
		}
		
	}

}
