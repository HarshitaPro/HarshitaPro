package practice;

public class Question1 {

	public static void main(String[] args) {
		
		int[] array1 = new int[1000];
		try {
			
			System.out.println(array1[array1.length]);
			}
		
			catch(ArrayIndexOutOfBoundsException e)
		    {
				System.out.println(e);
			}
		
			finally {
				System.out.println("finally block");
			
			}
		array1=null;
			
			System.gc();
			
			


}
}

