package july8;
import java.util.ArrayList;


public class Container <T>{
	
	
	private ArrayList<T> array ;
	
	Container(){
	array = new ArrayList<T>();
		
	}
	
	public void add(T obj) {
		
		array.add(obj);
	
	}
	public T get(int index) throws ArrayIndexOutOfBoundsException{
		
		
		return array.get(index);
	}
	
	
	public boolean  remove(T obj) {
		if(array.contains(obj)) {
			array.remove(obj);
			return true;
		}
		else {
			return false;
		}
	}
	public int size() {
		return array.size();
		
	}
	
	

}
