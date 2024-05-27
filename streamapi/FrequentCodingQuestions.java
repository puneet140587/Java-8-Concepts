package com.streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequentCodingQuestions {

	public static void main(String[] args) {

		// Write a Java Program to count the occurrence of each character in String

//		String input = "ilovejavatechie";
		
		// Approach 1
		/*
		 * Map<String, Long> characterCount1 = Arrays.stream(input.split(""))
		 * .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		 * System.out.println(characterCount1);
		 */

		// Approach 2 This approach maintain the insertion order of input string
		/*
		 * LinkedHashMap<String, Long> characterCount2 =
		 * Arrays.stream(input.split("")).map(String::toLowerCase)
		 * .collect(Collectors.groupingBy(str -> str, LinkedHashMap::new,
		 * Collectors.counting())); System.out.println(characterCount2);
		 */

		// Find all duplicates from String

//		Arrays.stream(input.split(""))
//		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//		.entrySet().stream().filter(i -> i.getValue() > 1)
//		.map(Map.entry::getKey)
//		.collect(Cooll)
		
		// How to check if list is empty in Java 8 using Optional, if not null iterate through the list and print the object?
		
		// How to find only duplicate elements with its count from the String ArrayList in Java8 ?
		/*
		 * List<String> duplicateCount = Arrays.asList("AA", "BB", "AA", "CC");
		 * 
		 * Map<String, Long> namesDuplicate = duplicateCount.stream().filter(x ->
		 * Collections.frequency(duplicateCount, x) > 1)
		 * .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		 * System.out.println(namesDuplicate);
		 */
		
	    //  How to count each element/word from the String ArrayList in Java8?
		/*
		 * List<String> elementCount = Arrays.asList("AA", "BB", "AA", "CC",
		 * "BB","DD","KK");
		 * 
		 * Map<String, Long> namesCount =
		 * elementCount.stream().collect(Collectors.groupingBy(Function.identity(),
		 * Collectors.counting())); System.out.println(namesCount);
		 */
		
		// How to use map to convert object into lowercase in Java 8?
		
		/*
		 * List<String> names = Arrays.asList("AA", "BB", "AA", "CC", "BB","DD","KK");
		 * List<String> lowerCaseLetter =
		 * names.stream().map(String::toLowerCase).collect(Collectors.toList()) ;
		 * System.out.println(lowerCaseLetter);
		 */
		
		// Write a Java 8 program to sort an array and then convert the sorted array into Stream?
		/*
		 * int[] arr = {45, 78, 91, 23, 39} ; Arrays.parallelSort(arr);
		 * Arrays.stream(arr).forEach(System.out::println) ;
		 */
		
		
		// Java 8 program to perform cube on list elements and filter numbers greater than 50.
		
		/*
		 * List<Integer> list = Arrays.asList(3,2,4,7,6,9) ; list.stream().map(e ->
		 * e*e*e).filter(e-> e>50).forEach(System.out::println) ;
		 */
				
		// How will you get the current date and time using Java 8 Date and Time API ?
		
		/*
		 * System.out.println("Current Local Date: " + java.time.LocalDate.now());
		 * System.out.println("Current Local Time: " + java.time.LocalTime.now());
		 * System.out.println("the current date & time is " +
		 * java.time.LocalDateTime.now());
		 */
		
		// Given a list of integers, sort all the values present in it in descending order using Stream functions?
			
		/*
		 * List<Integer> myList1 = Arrays.asList(12,57,36, 29, 49, 51,94); List<Integer>
		 * descendingList =
		 * myList1.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList
		 * ()); System.out.println(descendingList);
		 */
		
		// Given a list of integers, sort all the values present in it using Stream functions ?
		
		/*
		 * List<Integer> myList2 = Arrays.asList(12,57,36, 29, 49, 51,94);
		 * myList2.stream().sorted().forEach(System.out::println);
		 */
		
		// Given a String, find the first repeated character in it using Stream functions?
		
		// Given a String, find the first non-repeated character in it using Stream functions?
		
		// Given a list of integers, find the maximum value element present in it using Stream functions?
		
		/*
		 * List<Integer> myList = Arrays.asList(10,15,8,49,25,98,81,32,15); int
		 * maxElement = myList.stream().max(Integer::compare).get();
		 * System.out.println(maxElement);
		 */
		
		// Given a list of integers, find the total number of elements present in the list using Stream functions?
		
		/*
		 * List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15); long count =
		 * myList.stream().count(); System.out.println(count);
		 */                   
 
		// Given the list of integers, find the first element of the list using Stream functions?
		
		/*
		 * List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		 * myList.stream().findFirst().ifPresent(System.out::println) ;
		 */
		
		// How to find duplicate elements in a given integers list in java using Stream functions?
		
		// Given a list of integers, find out all the numbers starting with 1 using Stream functions?
		
		/*
		 * List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
		 * myList.stream().map(e -> e + "").filter(e ->
		 * e.startsWith("1")).forEach(System.out::println);
		 */
		 
		// Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
		 
		 List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
         list.stream().filter(n -> n%2 == 0).forEach(System.out::println);
     }
	

}
