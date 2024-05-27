package com.realworld;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByPerson {
	
	public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 25),
                new Person("David", 30),
                new Person("Eva", 25)
        );

        // Grouping people by their age
        Map<Integer, List<Person>> peopleByAge = people.stream()
                .collect(Collectors.groupingBy(Person::getAge));

        // Print the result
        peopleByAge.forEach((age, group) ->
                System.out.println("Age " + age + ": " + group));
    }

}
