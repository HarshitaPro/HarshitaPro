package this_keyword;

public class FinalVariable {
	
	int rollno;
	//we have to intialize the final variable at a time of declaration 
	//we cannot change the value of final variable once it initialize
	//if we do not initialize final variable at the time of declaration then we can initialize it by using constructor
	final String college;
	FinalVariable(String college){
		this.college=college;
	}
	
	final  float pi= 3.14f;
	
	double Area;
	
	
	//calculating area of circle using final variable pi
	//method is final so no other child class can override it
	public  final double CalculateArea(int radius) {
		Area = pi*radius *radius;
		
		
		
		return Area;
	}
	
	public static void main(String[] args) {
	 FinalVariable f = new FinalVariable("sarojin naidu govt.college");
	 f.rollno=123;
	// f.college="NRI";//compile time error 
	 System.out.println(f.rollno);
	 System.out.println(f.college);
	 
	 //printing value of calculate area method
	 
	System.out.println("Area of circle ="+ f.CalculateArea(2));
	}
	
	
	

}
