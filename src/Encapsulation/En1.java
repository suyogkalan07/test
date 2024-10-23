package Encapsulation;

public class En1 {

	private String name;
	private int empid;
	
	public void setname(String n) {
		this.name=n;
		System.out.println("User login");
		}
	
	public String getname() {
		return name;
	}
	
	public void setid(int id) {
		this.empid=id;
	}

	public int getid() {
		return empid;
	}
}
