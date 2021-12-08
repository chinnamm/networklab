package Com.Day3;
import java.util.LinkedHashMap;
import java.util.Hashtable;
import java.util.TreeMap;
import java.util.Map;
import java.util.Collections;

public class Demo1 {

	public static void main(String[] args) {
		Map<Integer,String> map=new LinkedHashMap<>();
		
		map.put(1,"lata");
		map.put(2,"shree");
		map.put(5,"vidya");
		map.put(4,"manu");
		map.put(3,"ram");
		map.put(10,"ramya");
		System.out.println(map);
		System.out.println(map.get(2));
		System.out.println(map.put(10, "cs"));
		System.out.println(map.containsKey(8));
		System.out.println(map.containsValue("lata"));
		System.out.println(map.remove(5));
		System.out.println(map.replace(3,"ram", "bhavana"));
		
        
		
		Map<Integer,String> map1=new TreeMap<>();
		map1.putAll(map);
		System.out.println(map);
		
		
		
	}

}
