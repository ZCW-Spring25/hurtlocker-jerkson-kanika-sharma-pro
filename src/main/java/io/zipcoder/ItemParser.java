package io.zipcoder;

import io.zipcoder.utils.Item;
import io.zipcoder.utils.ItemParseException;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;


 public class ItemParser {
    private int errorCount = 0;

    public List<Item> parseItemList(String valueToParse) {
        List<Item> itemList = new ArrayList<>();
        String [] itemString = valueToParse.split("##");
        for (String itemstring : itemString) {
            try {
                itemList.add(parseSingleItem(itemString + "##"));
            } catch (ItemParseException e) {
                e.printStackTrace();
                errorCount++;

            }
        }
        return itemList;
    }

    public Item parseSingleItem(String singleItem) throws ItemParseException {
String name = null;
String type = null;
String expiration = null;
Double price = null;
        Pattern i = Pattern.compile(";");
        Pattern nameValuePattern = Pattern.compile("[@:\\^*%]");
        singleItem = singleItem.substring(0, singleItem.length() - 2);

        String[] fieldString = i.split(singleItem);
        for (String fieldStrings : fieldString ) {
            String[] nameValues = nameValuePattern.split(fieldStrings);
            if (nameValues[0].equalsIgnoreCase("name")) {
                name = nameValues.length > 1 && nameValues[1] != null ? nameValues[1].toLowerCase() : null;
            } else if(nameValues[0].equalsIgnoreCase("type")) {
                type = nameValues.length > 1 && nameValues[1] != null ? nameValues[1].toLowerCase() : null;
            } else if (nameValues[0].equalsIgnoreCase("expiration")){
                expiration = nameValues.length > 1 && nameValues[1] != null ? nameValues[1].toLowerCase() : null;
            } else if ((nameValues[0].equalsIgnoreCase("price"))) {
                price = nameValues.length > 1 && nameValues[1] != null ? Double.parseDouble(nameValues[1]) : null;
            }
        }
        if ( name == null || type == null || expiration == null || price == null) {
            throw new ItemParseException();
        }
        //Item itemToReturn = new Item(parse(), parsePrice(singleItem), parseType(singleItem), parseData(singleItem) );
        return new Item (name, price, type, expiration);
    }

public int getErrorCount() {
    return errorCount;
}


}