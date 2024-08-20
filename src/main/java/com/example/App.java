package com.example;

import java.util.Arrays;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;
import com.google.common.collect.Lists;

/**
 * Medium Complexity Java 8 Application
 */
public class App 
{
    public static void main( String[] args )
    {
        // Example of using Streams (Java 8 feature)
        List<String> names = Arrays.asList("John", "Jane", "Adam", "Eve");
        names.stream()
             .filter(name -> name.startsWith("J"))
             .forEach(System.out::println);

        // Using old libraries
        // Apache Commons Collections (pre-Java 8)
        List<String> listA = Arrays.asList("a", "b", "c");
        List<String> listB = Arrays.asList("b", "c", "d");
        List<String> intersection = (List<String>) CollectionUtils.intersection(listA, listB);
        System.out.println("Intersection using Apache Commons Collections: " + intersection);

        // Google Guava (pre-Java 8)
        List<String> combinedList = Lists.newArrayList(listA);
        combinedList.addAll(listB);
        System.out.println("Combined List using Google Guava: " + combinedList);
    }
}
