package kyna.vn.test;

import java.util.ArrayList;

import kyna.vn.model.Man;
import kyna.vn.model.Person;
import kyna.vn.model.Woman;

public class TestPerson {

	public static void main(String[] args) {
		ArrayList<Person> dsPersons=new ArrayList<>();
		Person an=new Man();
		an.setFirstName("An");
		Person hong=new Woman();
		hong.setFirstName("Hồng");
		
		dsPersons.add(an);
		dsPersons.add(hong);
		for(Person ds:dsPersons) {
			if(ds instanceof Man) {
				System.out.println(ds.getFirstName()+" là Nam");
			} else if(ds instanceof Woman) {
				System.out.println(ds.getFirstName()+" là Nữ");
			}
		}
	}

}
