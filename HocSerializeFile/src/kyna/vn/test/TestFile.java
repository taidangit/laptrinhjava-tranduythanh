package kyna.vn.test;

import java.util.ArrayList;
import java.util.List;

import kyna.vn.io.FileFactory;
import kyna.vn.model.KhachHang;

public class TestFile {

	public static void main(String[] args) {
		/*List<KhachHang> dsKh=new ArrayList<>();
		dsKh.add(new KhachHang(1, "An"));
		dsKh.add(new KhachHang(2, "Bình"));
		dsKh.add(new KhachHang(3, "Hạnh"));
		dsKh.add(new KhachHang(3, "Phúc"));
		boolean kq=FileFactory.luuFile(dsKh, "E:/dataKH.dat");
		if(kq) {
			System.out.println("Lưu thành công");
		} else {
			System.out.println("Lưu thất bại");
		}*/
		
		Object data=FileFactory.docFile("E:/dataKH.dat");
		List<KhachHang> dsKh = (List<KhachHang>) data;
		for(KhachHang kh:dsKh) {
			System.out.println(kh.getMa()+"-"+kh.getTen());
		}
	}

}
