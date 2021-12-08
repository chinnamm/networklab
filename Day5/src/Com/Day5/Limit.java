package Com.Day5;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Limit {

	public static void main(String[] args) {
		List<Integer> ls=Arrays.asList(1,2,5,4,8);
		System.out.println(ls.stream().limit(3).collect(Collectors.toList()));
		//ls.stream().sorted().forEach(System.out::println);
		
		IntSummaryStatistics stats=ls.stream().mapToInt((x)->x).summaryStatistics();
		
		System.out.println("Highest Number"+stats.getMax());
		System.out.println("Minimum Number"+stats.getMin());
		System.out.println("Maximum Number"+stats.getSum());
		System.out.println("Average Number"+stats.getAverage());
		
	}

}
