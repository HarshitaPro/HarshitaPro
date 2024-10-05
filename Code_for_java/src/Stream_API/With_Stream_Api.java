package Stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class With_Stream_Api {

	public static void main(String[] args) {
		
		List<Product_list> li =new ArrayList<>();
		li.add(new Product_list(1,"Jeans",3500));
		li.add(new Product_list(2,"T-Shirt",3500));
		li.add(new Product_list(1,"denim-jacket",350));
		li.add(new Product_list(4,"ladies-bag",3500));
		li.add(new Product_list(2,"Coo",3500));
		int sum=0;
		
		
		List<Integer> list = li.stream().
				filter(p-> p.prize>3000).
				map(p-> p.prize).
				collect(Collectors.toList());
		
		System.out.println(list);
		
		List<Integer> listofprize = new ArrayList<>();
	  Integer total =li.stream().filter(p->p.prize>3000).peek(p->listofprize.add(p.prize)).mapToInt(pp->pp.prize)
			  .sum();
	  
	  System.out.println(total);
		
				
		
		
		
		
	}

}
