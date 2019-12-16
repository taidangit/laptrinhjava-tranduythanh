package kyna.vn;

import java.util.Random;
import java.util.Scanner;

public class TestRandom {

	public static void choi() {
		Random rd=new Random();
		int soMay=rd.nextInt(101);
		System.out.println("Máy đã ra 1 số [0..100] mời bạn đoán");
		int soNguoi;
		int soLanDoan=0;
		while(true) {
			System.out.println("Bạn đoán số gì?:");
			soNguoi =new Scanner(System.in).nextInt();
			soLanDoan++;
			System.out.println("Bạn đoán lần thứ "+soLanDoan);
			if(soNguoi==soMay) {
				System.out.println("Xin chúc mừng bạn đoán đúng rồi!, số bạn = số máy = "+soMay);
				break;
			
			} else if(soNguoi<soMay) {
				System.out.println("Bạn đoán sai rồi, số bạn <số máy");
			} else {
				System.out.println("Bạn đoán sai rồi, số bạn > số máy");
			}
			if(soLanDoan==7) {
				System.out.println("Game Over!, số máy="+soMay);
				break;
			}
		}
	}
	public static void main(String[] args) {
		while(true) {
			choi();
			System.out.println("Chơi tiếp ko>(c/k):");
			String line=new Scanner(System.in).nextLine();
			if(line.equalsIgnoreCase("k")) {
				break;
			}
		}
		System.out.println("Bye Bye!");
	}

}
