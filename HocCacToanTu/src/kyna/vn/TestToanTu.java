package kyna.vn;

public class TestToanTu {

	public static void main(String[] args) {
		double dtb=4.9;
		System.out.println(dtb>=5 ? "Bạn đậu" : "Bạn rớt");
		
		boolean kq=(5<4) || (7>3) || (100<0);
		System.out.println(kq);
		
		boolean kq2=(5<4) && (7>3) && (100<0);
		System.out.println(kq2);
		
		int x=8;
		int y=2;
		int z=x++ + ++y - 5;
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("z="+z);
		
		x=8;
		x=x++ - ++x;
		System.out.println(x);
		
		int k=(5*2)+(9-8)/3;
		System.out.println(k);
		
		x=8;
		y=2;
		k=3;
		z=--k - ++x - y++ + 2;
		System.out.println("x= "+x);
		System.out.println("y= "+y);
		System.out.println("k= "+k);
		System.out.println("z= "+z);

	}

}
