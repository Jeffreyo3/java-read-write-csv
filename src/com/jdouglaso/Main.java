package com.jdouglaso;

import com.jdouglaso.models.Property;
import com.jdouglaso.utils.CSVProcessor;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        List<List<String>> zillowData = CSVProcessor.resourceCSVtoList("zillow.csv");
        List<Property> properties = CSVProcessor.csvDataToProperties(zillowData);
        properties.forEach(System.out::println);
    }


}
