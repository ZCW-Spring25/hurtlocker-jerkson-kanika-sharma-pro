package io.zipcoder;

import io.zipcoder.utils.FileReader;
import io.zipcoder.utils.Item;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.beans.NameGenerator.capitalize;

public class GroceryReporter {
    private final String  originalFileText;


    //constructor to read file
    public GroceryReporter(String jerksonFileName) {
        this.originalFileText = FileReader.readFile(jerksonFileName);
    }


    //converts the grocery report into a formatted string
    @Override
    public String toString() {
ItemParser itemParser= new ItemParser();
        List<Item> items = itemParser.parseItemList(this.originalFileText); //extracting object items from itemParser class





//itemPriceMap stores all prices, itemCountMap stores how many times each item appears
Map<String, List<Double>> itemPriceMap = new HashMap<>();
        Map<String, Integer> itemCountMap = new HashMap<>();
        int errorCount = 0;


        //if name and price are missing then it counts it as an error
        for (Item item : items) {
            if (item.getName() == null || item.getPrice() == null ) {
                errorCount++;//counts no. of broken entries
                continue;
            }
            String nameKey = capitalize(item.getName());// first letter of item names are capitalized and rest in small letters
        }

        StringBuilder sb = new StringBuilder();

return null;
    }

//for each item name, it counts how many times each price appears
    public String getOriginalFileText() {
        return originalFileText;
    }
}

//
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