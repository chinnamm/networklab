package Com.Day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> ls2=new ArrayList<String>();
		
		ls2.add("Arya");
		ls2.add("Anu");
		ls2.add("Kavya");
		ls2.add("Raj");
		ls2.add("Suma");
		int size=ls2.size();
		System.out.println("Size of the array: "+size);
		ls2.stream().map(a -> a.length()).forEach(System.out::println);
		
		
		
		

	}

}
