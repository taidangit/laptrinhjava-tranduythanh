package kyna.vn.model;

public class Excutive extends Employee {
	private double bonus;
	public void awardBonus(double bonus) {
		this.bonus=bonus;
		System.out.println("Bonus="+bonus);
	}
	public double pay() {
		return super.pay()+this.bonus;
	}
}
