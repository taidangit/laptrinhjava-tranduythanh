package kyna.vn.test;

import kyna.vn.model.MyThread;

public class TestMyThread {

	public static void main(String[] args) {
		MyThread run1=new MyThread();
		MyThread run2=new MyThread();
		MyThread run3=new MyThread();
		
		Thread th1=new Thread(run1);
		th1.start();
		
		Thread th2=new Thread(run2);
		th2.start();
		
		Thread th3=new Thread(run3);
		th3.start();
	}

}
