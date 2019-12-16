package kyna.vn.model;

public class MyThread implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+":i="+i);
		}
	}
	
}
