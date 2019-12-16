package kyna.vn.model;

public class TamGiac {
	private double canhA;
	private double canhB;
	private double canhC;
	
	public TamGiac() {
		super();
		canhA=canhB=canhC=1;
	}
	public TamGiac(double canhA, double canhB, double canhC) {
		super();
		this.canhA = canhA;
		this.canhB = canhB;
		this.canhC = canhC;
	}
	public double getCanhA() {
		return canhA;
	}
	public void setCanhA(double canhA) {
		this.canhA = canhA;
	}
	public double getCanhB() {
		return canhB;
	}
	public void setCanhB(double canhB) {
		this.canhB = canhB;
	}
	public double getCanhC() {
		return canhC;
	}
	public void setCanhC(double canhC) {
		this.canhC = canhC;
	}
	public double tinhChuVi() {
		return canhA+canhB+canhC;
	}
	private double tinhNuaChuVi() {
		return tinhChuVi()/2;
	}
	public double tinhDienTich() {
		double p=tinhNuaChuVi();
		double dt=Math.sqrt(p*(p-canhA)*(p-canhB)*(p-canhC));
		return dt;
	}
	
}
