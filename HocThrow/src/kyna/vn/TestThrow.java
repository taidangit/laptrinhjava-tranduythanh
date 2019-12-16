package kyna.vn;

public class TestThrow {

	public static void PTB1(double a, double b) throws Exception{
		try {
			System.out.println("x="+(-b/a));

		} catch (Exception e) {
			throw e;
		}
	}
	public static void main(String[] args) {
		try {
			PTB1(1, 5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
