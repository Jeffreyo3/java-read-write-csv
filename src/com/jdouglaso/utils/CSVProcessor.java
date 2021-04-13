package com.jdouglaso.utils;

import com.jdouglaso.models.Property;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVProcessor {

    /**
     * @param filename String containing the name of file in "/resources" directory
     * @return A list (rows) containing a list (columns) of strings
     * @throws FileNotFoundException Signals that an attempt to open the file denoted by a specified pathname has failed.
     * @throws IOException           Signals that an I/O exception of some sort has occurred. This class is the general class of exceptions produced by failed or interrupted I/O operations.
     */
    public static List<List<String>> resourceCSVtoList(String filename) throws FileNotFoundException, IOException {
        File file = new File("resources/" + filename);
        List<List<String>> data = new ArrayList<>();

        BufferedReader csvReader = new BufferedReader(new FileReader(file.getAbsolutePath()));
        String row;
        while ((row = csvReader.readLine()) != null) {
            // Regex function splits on all comma characters unless it's in between quotes
            String[] col = row.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
            data.add(Arrays.asList(col));
        }
        csvReader.close();
        return data;
    }

    /**
     * Converts CSV data into a list of Property objects
     *
     * @param data Takes in a List (rows) containing a List (columns) of Strings
     * @return List of Property objects
     */
    public static List<Property> csvDataToProperties(List<List<String>> data) {
        List<Property> propertyList = new ArrayList<>();

        /*
         * CSV COLUMN FORMAT/SCHEMA:
         *
         * Index = 0
         * Living Space (sq ft) = 1
         * Beds = 2
         * Baths = 3
         * Zip = 4
         * Year = 5
         * List Price ($) = 6
         *
         */
        for (int i = 1; i < data.size(); i++) {
            Property property = new Property();

            //  data   .get(i)    .get(idx)                      .trim()
            // [CSV] [i = row] [idx = column] [removes white space from left/right of string]
            property.setIndex(data.get(i).get(0).trim());
            property.setSqFt(data.get(i).get(1).trim());
            property.setBeds(data.get(i).get(2).trim());
            property.setBaths(data.get(i).get(3).trim());
            property.setZip(data.get(i).get(4).trim());
            property.setYear(data.get(i).get(5).trim());
            property.setListPrice(data.get(i).get(6).trim());

            propertyList.add(property);
        }

        return propertyList;
    }
}
