package Com.Day5;


import java.util.Arrays;
import java.util.List;

public class Filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls=Arrays.asList("abc","s","","poi");
		long count=ls.stream().filter(s->s.isEmpty()).count();
		System.out.println(count);
		
	}

}
