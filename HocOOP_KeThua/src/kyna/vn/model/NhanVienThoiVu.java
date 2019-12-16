package kyna.vn.model;

public class NhanVienThoiVu extends NhanVien {

	public NhanVienThoiVu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NhanVienThoiVu(int ma, String ten) {
		super(ma, ten);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tinhLuong() {
		super.tinhLuong();
		System.out.println("==>Đây là nhân viên thời vụ");
	}
	
}
