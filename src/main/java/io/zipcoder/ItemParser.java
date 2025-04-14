package io.zipcoder;

import io.zipcoder.utils.Item;
import io.zipcoder.utils.ItemParseException;

import java.util.ArrayList;
import java.util.List;

public class ItemParser {
    public List<Item> parseItemList(String valueToParse) {
        List<Item> itemList = new ArrayList<>();
        String [] tempArray = valueToParse.split("##");
        for (String string : tempArray) {
            try {
                itemList.add(parseSingleItem(string + "##"));
            } catch (ItemParseException e) {

            }
        }
        return itemList;
    }

    public Item parseSingleItem(String singleItem) throws ItemParseException {

        Item itemToReturn = new Item(parseName(String singleItem), parsePrice(singleItem), parseType(single Item), parseData(singleItem) )
        return itemToReturn;
    }
}
