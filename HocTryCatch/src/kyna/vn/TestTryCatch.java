package kyna.vn;

public class TestTryCatch {

	public static void main(String[] args) {
		
		try {
			int x=5;
			int y=20/10;
			System.out.println("x="+x);
			System.out.println("y="+y);
			int z=x/y;
			System.out.println("z="+z);
			
			int d=Integer.parseInt("15.5");
			System.out.println(d);
			double k =992434243;
			double l =Double.MAX_VALUE;
			double p=k*l;
			System.out.println("p="+p);
		} catch(ArithmeticException e) {
			System.out.println("Lỗi rồi!");
			e.printStackTrace();
	
		} catch(NumberFormatException e) {
			System.out.println("Lỗi chuyển số bị sai");
		} catch (Exception e) {
			System.out.println("Có lỗi:");
			e.printStackTrace();
		}
		System.out.println("Cảm ơn bạn");
		
	}

}
