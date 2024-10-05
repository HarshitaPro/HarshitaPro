package Stream_API;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Concate_String {

	public static void main(String[] args) {
		
		List<String> language = new ArrayList<>();
		language.add("hindi");
		language.add("English");
		language.add("Tamil");
		language.add("Telgu");
		language.add("Konkani");
		
		//joining method is used to concate elements into a single string
		
		
		String concate_list= language.stream().collect(Collectors.joining(" "));
		System.out.println(concate_list);
		
		
		
		
		
		
		
		

	}

}
