package io.zipcoder;

import io.zipcoder.utils.FileReader;

import java.util.Arrays;

public class GroceryReporter {
    private final String  originalFileText;

    public GroceryReporter(String jerksonFileName) {
        this.originalFileText = FileReader.readFile(jerksonFileName);
    }

    @Override
    public String toString() {

return null;
    }


    public String getOriginalFileText() {
        return originalFileText;
    }
}
//public static String reverseFirstWordThenCamelCase(String sentence) {
//        String [] words = sentence.split("\\W+");
//        String first = words [0];
//        String reverse = new StringBuilder(first).reverse().toString();
//        return reverse.substring(0, 1).toUpperCase() + reverse.substring(1);
//    }
//public String split(String regex)
//
//public String split(String regex, int limit)
// public String getOriginalFileText() {
//        return originalFileText;
//    }
//String [] filename = originalFileText.split("\\##+");
//String jerksonFileName = "Milk##Bread##Cookies##Apple";
//        String items = Arrays.toString(jerksonFileName.split("##"));