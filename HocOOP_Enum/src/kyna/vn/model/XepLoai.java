package kyna.vn.model;

public enum XepLoai {
	Gioi ("Giỏi"),
	Kha ("Khá"),
	TrungBinh ("Trung bình"),
	Yeu ("Yếu");
	private String msg;
	private XepLoai(String msg) {
		this.msg=msg;
	}
	public String description() {
		return this.msg;
	}
}
