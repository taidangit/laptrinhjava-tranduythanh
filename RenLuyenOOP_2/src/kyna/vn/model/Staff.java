package kyna.vn.model;

import java.util.ArrayList;

public class Staff {

	private ArrayList<StaffMember> staffList;
	
	public Staff() {
		super();
		staffList=new ArrayList<>();
	}
	public ArrayList<StaffMember> getStaffList() {
		return staffList;
	}
	public void setStaffList(ArrayList<StaffMember> staffList) {
		this.staffList = staffList;
	}
	public void addStaffMenber(StaffMember staffMember) {
		staffList.add(staffMember);
	}
	public void payDay() {
		for(StaffMember staffMember: staffList) {
			System.out.println(staffMember);
		}
	}

}
