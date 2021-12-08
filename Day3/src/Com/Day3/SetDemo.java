package Com.Day3;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo {
	public static void main(String args[])
	{
		HashSet<Integer> hash=new HashSet<Integer>();
		hash.add(10);
		hash.add(100);
		hash.add(5);
		
		System.out.println(hash);
		
		
		TreeSet<Integer> hass=new TreeSet<Integer>();
		hass.add(10);
		hass.add(100);
		hass.add(5);
		
		System.out.println(hass);
		
		
		LinkedHashSet<Integer> hasss=new LinkedHashSet<Integer>();
		hasss.add(10);
		hasss.add(100);
		hasss.add(5);
		
		System.out.println(hasss);
		
	}

}
