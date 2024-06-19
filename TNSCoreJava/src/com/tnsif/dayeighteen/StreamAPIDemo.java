package com.tnsif.dayeighteen;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIDemo {

	public static void main(String[] args) {
		//Acquire a stream - Stream.of(values)
		Stream<Integer> numStream=Stream.of(1,5,3,7,2,8,2,5);
		//Terminal ops -> count() - count the value
		System.out.println("Total Value: "+numStream.count());
		
		numStream=Stream.of(1,5,3,7,2,8,2,5);
		//find distinct values
		Stream<Integer> distinctNums=numStream.distinct();
		
		long cnt=distinctNums.count();
		
		System.out.println("Total distinct Value: "+cnt);	
	
		//skip
		numStream= Stream.of(1,5,3,7,2,8,2,5);
		cnt=numStream.skip(3).count();
		// java.lang.IllegalArgumentException
		//cnt=numStream.skip(-2).count();
		System.out.println("Total Value after skipping: "+cnt);
		
		//limit
		numStream= Stream.of(1,5,3,7,2,8,2,5);
		numStream=numStream.limit(5);
		cnt=numStream.count();
		
		System.out.println("Total value after limit(5): "+cnt);

		//Terminal op - collect
		numStream= Stream.of(1,5,3,7,2,8,2,5);
		List<Integer> numList=numStream.collect(Collectors.toList());
		System.out.println(numList);
		
		numStream= Stream.of(1,5,3,7,2,8,2,5);
		List<Integer> distinctInt=numStream.distinct().collect(Collectors.toList());
		System.out.println(distinctInt);
		
		//forEach - perform operation on each value of stream
		numStream= Stream.of(1,5,3,7,2,8,2,5);
		//method reference
		numStream.forEach(System.out::print);
	}

}
