package com.streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Stream_Basics {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(5,15,30,23,46,89,39, 57,23,15, 63,78,44,24) ;
		
		//  find out only even no from list
		List<Integer> filteredList = list.stream().filter(i -> i%2 ==0).collect(Collectors.toList()) ;
		System.out.println("filtered Elements -> " + filteredList);
		
	    //  Multiply each no of list by 2
		List<Integer> transformedList = list.stream().map(i -> i * 2).collect(Collectors.toList()) ;
		System.out.println("Multiple of no 2 ->" + transformedList);
		
		// Sum of all numbers of List
		Optional<Integer> sum = list.stream().reduce((a,b) -> a + b) ;
		System.out.println("Sum of all no are -> " +  sum.get());
		
		// Average of all numbers of list
		double average = list.stream().mapToInt(e -> e).average().getAsDouble() ;
		System.out.println("Average of all numbers is -> " + average);
		
		// Square -> Filter -> Average of numbers
		double average1 = list.stream().map(e -> e * e).filter(e -> e > 100).mapToInt(e -> e).average().getAsDouble() ;
		System.out.println("Average after squaring & Filtering -> " + average1);
		
		// Even numbers
		List<Integer> evenNumbers = list.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
		System.out.println("Even numbers -> " + evenNumbers);
		
		// Odd numbers
		List<Integer> oddNumbers = list.stream().filter(i -> i%2 != 0).collect(Collectors.toList());
		System.out.println("Odd numbers -> " + oddNumbers);
		
		// Max numbers
		int max = list.stream().max(Comparator.comparing(Integer::valueOf)).get() ;
		System.out.println("Maximum number is -> " + max);
		
		// another way to find MAX
		int resultMax = list.stream().reduce(Integer::max).get();
		System.out.println("Maximum number is -> " + resultMax);
		
		// Min numbers
		int min = list.stream().min(Comparator.comparing(Integer::valueOf)).get() ;
		System.out.println("Minimum number is -> " + min);
		
		// another way to find MIN
		int resultMin = list.stream().reduce(Integer::min).get();;
		System.out.println("Minimum number is -> " + resultMin);
		
		// Sorting in Ascending Order
		List<Integer> ascList = list.stream().sorted().collect(Collectors.toList()) ;
		System.out.println("Ascending order number list -> " + ascList);
		
		// Sorting in Descending order
		List<Integer> descList = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()) ;
		System.out.println("Descending order number list -> " + descList);
		
		// Get initial 5 number and add them
		int limitSum = list.stream().limit(5).reduce((p,q)-> p+q).get() ;
		System.out.println("Initial 5 number sum is  -> " + limitSum);
		
		// Skip Initial 5 numbers and add remaining numbers
		int skipSum = list.stream().skip(5).reduce((p,q)-> p+q).get() ;
		System.out.println("Initial 5 number sum is  -> " + skipSum);
		
		// Find Second Highest number from the list
		int secHighest = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println("The second highest number is  -> " + secHighest);
		
		// Find Second Lowest number from the list
		int secLowest = list.stream().sorted().distinct().skip(1).findFirst().get();
		System.out.println("The second Lowest number is  -> " + secLowest);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
