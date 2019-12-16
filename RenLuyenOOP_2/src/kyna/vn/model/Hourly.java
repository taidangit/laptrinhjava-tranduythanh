package kyna.vn.model;

public class Hourly extends Employee{
	private int hourWorked;
	public void addHours(int hoursworked) {
		this.hourWorked=hoursworked;
	}
	public double pay() {
		return this.hourWorked*50;
	}
	@Override
	public String toString() {
		return super.toString();
	}
}
