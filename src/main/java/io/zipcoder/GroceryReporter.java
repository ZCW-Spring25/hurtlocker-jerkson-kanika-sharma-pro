package io.zipcoder;

import io.zipcoder.utils.FileReader;
import io.zipcoder.utils.Item;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroceryReporter {
    private final String  originalFileText;

    public GroceryReporter(String jerksonFileName) {

        this.originalFileText = FileReader.readFile(jerksonFileName);
    }

    @Override
    public String toString() {
ItemParser itemParser= new ItemParser();
        List<Item> items = itemParser.parseItemList(this.originalFileText);

        Map<String, Integer> itemMap = new HashMap<>();
        int errorCount = 0;
        for (Item item : items) {
            if (item.getName() == null) {
                errorCount++;
            }
        }

        StringBuilder sb = new StringBuilder();

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