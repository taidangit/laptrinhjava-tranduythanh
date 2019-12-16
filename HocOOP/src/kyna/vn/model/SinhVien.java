package kyna.vn.model;

public class SinhVien {
	private String hoTen;
	private double diem;
	
	public SinhVien() {
		System.out.println("Đây là Constructor mặc định");
		this.hoTen="xyz";
	}
	
	public SinhVien(String hoTen, double diem) {
		super();
		this.hoTen = hoTen;
		this.diem = diem;
		System.out.println("Đây là Constructor có đối số");
	}
	
	public void xuatThongTin() {
		System.out.println(hoTen+"-"+diem);
	}

	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public double getDiem() {
		return diem;
	}
	public void setDiem(double diem) {
		this.diem = diem;
	}
	
	@Override
	public String toString() {
		return hoTen+"-"+diem;
	}
}
