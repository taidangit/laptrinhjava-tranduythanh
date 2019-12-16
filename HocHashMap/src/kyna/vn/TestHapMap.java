package kyna.vn;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHapMap {

	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<>();
		map.put(1, "An");
		map.put(2, "Bình");
		map.put(3, "Hạnh");
		map.put(4, "Phúc");
		map.put(5, "Giải");
		map.put(6, "Thoát");
		Collection<String> dsTen=map.values();
		for(String ten : dsTen) {
			System.out.println(ten);
		}
		System.out.println("Danh sách mã:");
		Set<Integer> dsMa=map.keySet();
		for(int ma : dsMa) {
			System.out.println(ma);
		}
		String ten=map.get(4);
		System.out.println(ten);
		if(map.containsKey(5)) {
			map.put(5, "Happy");
		}
		System.out.println("Danh sách sau khi chèn:");
	    dsTen=map.values();
		for(String ten1 : dsTen) {
			System.out.println(ten1);
		}
		map.remove(2);
		System.out.println("Danh sách sau khi xóa:");
	    dsTen=map.values();
		for(String ten1 : dsTen) {
			System.out.println(ten1);
		}
		map.clear();
		System.out.println("Số phần tử còn lại="+map.size());
		
	}

}