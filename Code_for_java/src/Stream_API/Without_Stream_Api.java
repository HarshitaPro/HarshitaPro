package Stream_API;
import java.util.*;


public class Without_Stream_Api {

	public static void main(String[] args) {
		
		System.out.println("Without StreamApi");
		
		List<Product_list> li =new ArrayList<>();
		li.add(new Product_list(1,"Jeans",3500));
		li.add(new Product_list(2,"T-Shirt",3500));
		li.add(new Product_list(1,"denim-jacket",350));
		li.add(new Product_list(4,"ladies-bag",3500));
		li.add(new Product_list(2,"Coo",3500));
		
		
		
		int sum=0;
		
	   for(Product_list i: li) {
		   
		 if(i.prize>3000) {
			 
			 System.out.println("List items:"+i.item +"  list prize: "+ i.prize);
			 sum= sum+i.prize;
			
            
			
		 }
		
		   
	   }
	   System.out.println("total sum= "+sum);
		
	}

}
