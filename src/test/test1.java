package test;

public class test1 {
	

	public static void main(String[] args) {
	        
	      int marks=86;
	      if (marks<35) {
	    	  System.out.println("Fail");
	      }
	      else if(marks>=35 && marks<=50) {
	    	  System.out.println("Grade D");
	      }
	      else if(marks>=51 && marks<=60) {
	    	  System.out.println("Grade C");
	      }
	      else if(marks>=61 && marks<=75) {
	    	  System.out.println("Grade B");
	      }
	      else if(marks>=76 && marks<=85) {
	    	  System.out.println("Grade A");
	      }
	      else{
	    	  System.out.println("Grade A+");
	      }
	   }
}
