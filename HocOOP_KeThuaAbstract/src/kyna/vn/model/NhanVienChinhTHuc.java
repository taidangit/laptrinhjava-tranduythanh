package kyna.vn.model;

public class NhanVienChinhTHuc extends NhanVien {

	
	public NhanVienChinhTHuc() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NhanVienChinhTHuc(int ma, String ten) {
		super(ma, ten);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tinhLuong() {
		// TODO Auto-generated method stub
		System.out.println("Nhân viên chính thức tính lương");
	}
	
}
