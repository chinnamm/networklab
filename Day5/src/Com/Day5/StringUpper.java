package Com.Day5;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringUpper {

	public static void main(String[] args)
	{
		/*List<String> ls=new ArrayList<String>();
		
		ls.add("Arya");
		ls.add("Anu");
		ls.add("Kavya");
		ls.add("Raj");
		ls.add("Suma");
		ls.replaceAll(String::toUpperCase);
		System.out.println("UpperCase list is:"+ls);
		ls.stream().map(a -> a.toUpperCase()) .forEach(a -> System.out.print(a+ "\t"));*/
		
		
		
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
