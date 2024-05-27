package com.streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream_Tricky {

	public static void main(String[] args) {
		
		// Print the numbers starts with prefix 2 & -2 using streams
		List<Integer> list = Arrays.asList(22,42,29,67,54,77,235, -29);
		
		List<Integer> num_with_2 = list.stream().map(e -> String.valueOf(e))
			.filter(e -> e.startsWith("2") || e.startsWith("-2")).map(Integer::valueOf).collect(Collectors.toList()) ;
		System.out.println("Numbers starting with 2 -> " + num_with_2);
		
		// Another easy way but with less Java 8 Features
		List<Integer> integersStartingWith = list.stream().filter(e -> e.toString().charAt(0) == '2')
			.collect(Collectors.toList());
		System.out.println("integers Starting With  2 -> " + integersStartingWith);
		
	//*****************************************************************************************************************	
		
		// Print the duplicate numbers using Streams
		List<Integer> list2 = Arrays.asList(1,3,10,20,30,15,1,13,1,2,2,10,30,19,3) ;
		
		Set<Integer> duplicatesNum = list2.stream().filter(e -> Collections.frequency(list2, e)> 1).collect(Collectors.toSet()) ;
		System.out.println("duplicates number using frequency method -> " + duplicatesNum);
		
		// Another way using using Hashset
		Set<Integer> dupNum = new HashSet<Integer>();
		Set<Integer> duplicates = list2.stream().filter(e -> !dupNum.add(e)).collect(Collectors.toSet());
		System.out.println("Duplicates number using hashset -> " + duplicates);
		
		
		//*****************************************************************************************************************	
		
		// Find the longest String from Given Array
		
		// Java Program to find all elements from Array who starts with 1
		
		// String.join method example
		
		//Skip & Limit use case based 
		IntStream.rangeClosed(1, 10).skip(1).limit(8).forEach(System.out::println);
		
		// Sort a list & Map
		
		// Map & FlatMap example
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
