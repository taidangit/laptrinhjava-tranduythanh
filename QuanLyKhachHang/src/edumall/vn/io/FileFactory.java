package edumall.vn.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import edumall.vn.model.KhachHang;


public class FileFactory {
	public static boolean saveFile(ArrayList<KhachHang> dsKh, String path) {
		try {
			FileOutputStream fos=new FileOutputStream(path);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(dsKh);
			oos.close();
			fos.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public static ArrayList<KhachHang> readFile(String path) {
		ArrayList<KhachHang> dsKh=new ArrayList<>();
		try {
			FileInputStream fis=new FileInputStream(path);
			ObjectInputStream ois=new ObjectInputStream(fis);
			Object data=ois.readObject();
			dsKh=(ArrayList<KhachHang>) data;
			ois.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dsKh;
	}
}
