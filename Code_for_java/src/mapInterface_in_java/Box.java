package mapInterface_in_java;

public class Box <T>{
       T Container;
        Box( T Container){
        	this.Container = Container;
        }
        
        public T getValue() {
        	return this.Container;
        }
        
        public static void main(String[] args) {
			Box <String > tt = new Box<>("ViVo");
			System.out.println(tt.getValue());
		}

}
