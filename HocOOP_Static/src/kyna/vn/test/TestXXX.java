package kyna.vn.test;

import kyna.vn.model.XXX;

public class TestXXX {

	public static void main(String[] args) {
		XXX a=new XXX();
		a.setA(113);
		
		XXX b=new XXX();
		System.out.println(b.getA());
		
		XXX c=new XXX();
		System.out.println(c.getA());
		c.setA(114);
		System.out.println(a.getA());
		
		XXX.fn1();
	}

}
