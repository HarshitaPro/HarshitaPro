package june24Abstract;
import java.util.function.*;

public class Demo {
	
	Demo(){
		System.out.println("hello i am demo");
	}
	
	public static void main(String[] args) {
		
		FunInterface obj = (int x)->System.out.println("hello");
		obj.show(3);
		
		Consumer <String > c = (value1)-> System.out.println(value1);
		 c.accept("harshita");
		
		
		BiConsumer<Integer,Integer> consumer = (value,value1) -> System.out.println(value);
		consumer.accept(5,7);
		
		Predicate  <Integer > pre = (value)->value!=null;
		System.out.println(pre.test(3));
		
		Predicate<String > pre1 = (value)-> value.contains("sona");
		System.out.println(pre1.test("sona is best"));
		
		Function<Integer,Boolean > fun = (value)-> value!=0;
		System.out.println(fun.apply(4));
		
		Supplier<Integer> sup = ()->7;
		System.out.println(sup.get());
		
		Runnable r= ()->System.out.println("i am runnable");
		Thread t = new Thread(r);
		t.start();
		
		Consumer <String > consumer1 =FunInterface2 :: show;
		
		new Demo();
		
	}


}
