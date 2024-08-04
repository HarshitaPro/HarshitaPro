package july8;

public class Demo {

	public static void main(String[] args) {
		Container <String> list = new Container<>();
		//adding elements of string type in container
		
		list.add("hello");
		list.add("world");
		list.add("java");
		
		//printing element of certain index
		System.out.println(list.get(1));
		
		//remove a certain elment
		
		list.remove("hello");
		
		//printing size of container
		System.out.println("Size of list "+list.size());
		
		//creating container's another object
		
		Container<Integer> list2 = new Container<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		
		//printing element of certain index
				System.out.println(list2.get(1));
				
         	//remove a certain elment
				
				list2.remove(2);
				
				//printing size of container
				System.out.println("Size of list2  "+list.size());
		
		
		
	}

}
