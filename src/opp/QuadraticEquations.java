

public class quiz_5 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
	    System.out.print("Enter a, b, c: ");
	    double a = input.nextDouble();
	    double b = input.nextDouble();
	    double c = input.nextDouble();

	    QuadraticEquation equation = new QuadraticEquation(a, b, c);
	    double discriminant = equation.getDiscriminant();

	    if (discriminant < 0) {
	      System.out.println("The equation has no roots");
	    }
	    else if (discriminant == 0)
	    {
	      System.out.println("The root is " + equation.getRoot1());
	    }
	    else // (discriminant >= 0)
	    {
	      System.out.println("The roots are " + equation.getRoot1() 
	        + " and " + equation.getRoot2());
	    }  

	}
}



 class QuadraticEquation{
	private double a=0;
	private double b=0;
	private double c=0;
	
	public QuadraticEquation(double newA,double newB,double newC){
		a=newA;
		b=newB;
		c=newC;
	}
	
	public double getA(){
		return a;
	}
	public void setA(double newA){
		  a=newA;
	  }
	
	
	
	public double getB(){
		return b;
	}
	public void setB(double newB){
		  b=newB;
	  }
	
	
	public double getC(){
		return c;
	}
	public void setC(double newC){
		  c=newC;
	  }
	
	

	    public double getDiscriminant() {
	         return (Math.pow(b,2)) - (4.0 * a * c);
	    }

	    public double getRoot1() {
	            return  (-b + Math.sqrt(getDiscriminant())) / (2.0 * a);
	    }

	    public double getRoot2() {
	            return  (-b - Math.sqrt(getDiscriminant())) / (2.0 * a);
	    }
}

