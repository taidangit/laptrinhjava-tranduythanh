package kyna.vn;

public class TestFinally {

	public static void main(String[] args) {
		try {
			int x=5;
			int y=1;
			int z=x/y;
			System.out.println("z="+z);
			System.out.println("Cảm ơn bạn");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Trời sập ta vẫn chạy!");
		}
	}

}
