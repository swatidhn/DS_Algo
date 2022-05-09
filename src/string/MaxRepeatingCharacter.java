package string;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxRepeatingCharacter {
	
	public static void main(String s)
	{
		s="swatikumari";
		Stream<Character> characterStream = s.chars()
				  .mapToObj(c -> (char) c);
		Map<Character, Long> map=characterStream.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		Long max= 0l;
		for(Long entry:map.values())
		{
			max= Long.max(max, entry);
		}
		
		System.out.print(map.get(max));
		
	}
	
	

}
