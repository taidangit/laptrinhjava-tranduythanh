package kyna.vn.model;

public class SinhVien implements IlamViec, IGiaiTri{

	@Override
	public void complexity() {
		// TODO Auto-generated method stub
		System.out.println("Công việc phức tạp");
	}

	@Override
	public void diffuculty() {
		// TODO Auto-generated method stub
		System.out.println("Công việc khó khăn");
	}

	@Override
	public void hatHo() {
		// TODO Auto-generated method stub
		System.out.println("Giả trí hát hò");
	}

}
