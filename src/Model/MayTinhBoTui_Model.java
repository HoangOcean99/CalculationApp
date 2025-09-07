package Model;

public class MayTinhBoTui_Model {
	private double a;
	private double b;
	public MayTinhBoTui_Model() {
		this.a = 0;
		this.b = 0;
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	
	public double Cong() {
		return a+b;
	}
	public double Tru() {
		return a-b;
	}
	public double Nhan() {
		return a*b;
	}
	public double Chia() {
		return a/b;
	}
	public double mu() {
		return Math.pow(a, b);
	}
	
	
	
	

}
