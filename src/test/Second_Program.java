package test;

public class Second_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//call static variable
		System.out.println(First_class.x);
		
		//call non static variable from another class
		First_class f=new First_class();
		System.out.println(f.y);
	}

}
