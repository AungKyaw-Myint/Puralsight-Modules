package org.puralsight;

import org.puralsight.model.Person;
import org.puralsight.ui.Program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GenericLearningMain {
    static void main() {

        Program program = new Program();

        List<Person> people = Arrays.asList(
                new Person("John", "Smith", 25),
                new Person("Sarah", "Jones", 32),
                new Person("Mike", "Brown", 19),
                new Person("Emily", "Davis", 41),
                new Person("Chris", "Wilson", 28)
        );

        // STEP 1
        // Search names using stream + filter

        String searchName = "s";

        List<Person> matchingPeople = people.stream()
                .filter(person ->
                        person.getFirstName().toLowerCase().contains(searchName.toLowerCase()) ||
                                person.getLastName().toLowerCase().contains(searchName.toLowerCase()))
                .collect(Collectors.toList());

        System.out.println("Matching names:");
        matchingPeople.forEach(System.out::println);


        // STEP 2
        // Average age using streams

        int totalAge = people.stream()
                .map(Person::getAge)
                .reduce(0, Integer::sum);

        double averageAge = (double) totalAge / people.size();

        System.out.println("\nAverage age: " + averageAge);


        // STEP 3
        // Oldest age

        int oldestAge = people.stream()
                .map(Person::getAge)
                .reduce(0, Integer::max);

        System.out.println("Oldest age: " + oldestAge);


        // Youngest age

        int youngestAge = people.stream()
                .map(Person::getAge)
                .reduce(Integer.MAX_VALUE, Integer::min);

        System.out.println("Youngest age: " + youngestAge);
    }
}
