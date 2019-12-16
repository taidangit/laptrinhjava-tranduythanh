package kyna.vn.test;

import kyna.vn.model.Employee;
import kyna.vn.model.Excutive;
import kyna.vn.model.Staff;

public class TestStaff {

	public static void main(String[] args) {
		Staff staff=new Staff();
		Employee teo=new Employee();
		teo.setName("Tèo");
		teo.setAddress("Quận 1");
		teo.setPhone("123");
		teo.setPayRate(0.12);
		teo.setSocialSecurityNumber("SEC234");
		
		staff.addStaffMenber(teo);
		
		Employee ty=new Employee();
		ty.setName("Tý");
		ty.setAddress("Quận 12");
		ty.setPhone("456");
		ty.setPayRate(0.15);
		ty.setSocialSecurityNumber("SEC235");
		
		staff.addStaffMenber(ty);
		
		Excutive an=new Excutive();
		an.setName("An");
		an.setAddress("Quận 11");
		an.setPhone("789");
		an.setPayRate(0.17);
		an.setSocialSecurityNumber("SEC239");
		an.awardBonus(100);
		
		staff.addStaffMenber(an);
		
		staff.payDay();
	}

}
