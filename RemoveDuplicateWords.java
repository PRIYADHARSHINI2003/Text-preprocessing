import java.util.Arrays;
import java.util.stream.Collectors;
public class RemoveDuplicateWords extends noiseremoval{
			
		public  String removeDuplicatewords(String my_str) {
					
		my_str = Arrays.stream(my_str.split("\\s+")).distinct().collect(Collectors.joining(" ")).toString();
		System.out.println("After removing duplicate words: ");
		display(my_str);
		return my_str;
		}

}



			
