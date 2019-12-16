package kyna.vn.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import kyna.vn.model.DanhBa;

public class FileFactory {
	public static boolean saveFile(List<DanhBa> dsDb, String path) {
		try {
			FileOutputStream fos=new FileOutputStream(path);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(dsDb);
			oos.close();
			fos.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public static List<DanhBa> readFile(String path) {
		List<DanhBa> dsDb=new ArrayList<>();
		try {
			FileInputStream fis=new FileInputStream(path);
			ObjectInputStream ois=new ObjectInputStream(fis);
			Object data=ois.readObject();
			dsDb=(List<DanhBa>) data;
			ois.close();
			fis.close();
			return dsDb;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
