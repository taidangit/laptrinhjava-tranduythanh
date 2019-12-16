package kyna.vn.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import kyna.vn.model.Contact;

public class FileFactory {
	public static boolean saveFile(Map<Integer, Contact> csdl, String path) {
		try {
			FileOutputStream fos=new FileOutputStream(path);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(csdl);
			oos.close();
			fos.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public static Map<Integer, Contact> readFile(String path) {
		Map<Integer, Contact> csdl=new HashMap<>();
		try {
			FileInputStream fis=new FileInputStream(path);
			ObjectInputStream ois=new ObjectInputStream(fis);
			Object data=ois.readObject();
			csdl=(Map<Integer, Contact>) data;
			ois.close();
			fis.close();
			
			return csdl;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}