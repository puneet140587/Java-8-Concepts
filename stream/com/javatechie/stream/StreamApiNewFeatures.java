package com.javatechie.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiNewFeatures {

    /**
     * @param args
     */
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Puneet", "Richa", null, "Prachi", null, "Meeshu", "Aviraj");

        // Traditional Filter way
        /*
         * List<String> nonNullList = names.stream().filter(name -> name !=
         * null).collect(Collectors.toList());
         * System.out.println(nonNullList);
         */

        // Using ofNullable method of Stream api
        /*
         * List<String> nonNullNamesList =
         * names.stream().flatMap(Stream::ofNullable).collect(Collectors.toList());
         * System.out.println(nonNullNamesList);
         */

        /*
         * Using Stream api Iterate method to generate sequenece of number with certain
         * pattern
         */
        // Stream.iterate(0, n -> n * 3).limit(5).forEach(System.out::println);

        // Collecting & then method
        List<Employee> employees = Arrays.asList(
                new Employee("Puneet", 15200),
                new Employee("Richa", 49000),
                new Employee("Kritika", 23000),
                new Employee("Divit", 9000));
        /*
         * Long averegeSalary =
         * employees.stream().mapToDouble(Employee::getSalary).boxed()
         * .collect(Collectors.collectingAndThen(Collectors.averagingDouble(Double::
         * doubleValue), Math::round));
         * System.out.println(averegeSalary);
         */

        /* Drop whille & take while method */
        // List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // List<Integer> results = numbers.stream().dropWhile(num -> num <
        // 3).takeWhile(num -> num < 7)
        // .collect(Collectors.toList());
        // System.out.println(results);

    }

}
