package Encapsulation;

public class Enbank {

	private double balance;
	private String name;
	
	public void setbalance(double d) {
		this.balance+=d;
	}
	public double getbalance() {
		return balance;
	}
	
	public void setname(String s) {
		this.name=s;
	}
	public String getname() {
		return name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
