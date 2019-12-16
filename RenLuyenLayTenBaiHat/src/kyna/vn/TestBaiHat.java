package kyna.vn;

public class TestBaiHat {

	public static String TenBaiHatCoMP3(String baiHat) {
		int vtCuoi=baiHat.lastIndexOf("/");
		String ten=baiHat.substring(vtCuoi+1);
		return ten;
	}
	public static String TenBaiHatKhongCoMP3(String baiHat) {
		int vt1=baiHat.lastIndexOf("/");
		int vt2=baiHat.lastIndexOf(".");
		String ten=baiHat.substring(vt1+1, vt2);
		return ten;
	}
	public static void main(String[] args) {
		String baiHat="D:/music/bolero/longme.mp3";
		String kq=TenBaiHatCoMP3(baiHat);
		System.out.println(kq);
		
		String kq1=TenBaiHatKhongCoMP3(baiHat);
		System.out.println(kq1);
	}

}
