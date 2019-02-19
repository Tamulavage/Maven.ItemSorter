package rocks.zipcode.io;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {

    private ArrayList<Item> items;

    public ItemSorter(Item[] items) {
        ArrayList temp = new ArrayList(items.length);
        temp.addAll(Arrays.asList(items));

        this.items = temp;

    }

    public Item[] sort(Comparator<Item> comparator) {

        Collections.sort(this.items, comparator);
        Item[] retVal = new Item[this.items.size()];
        for(int i = 0; i<this.items.size(); i++){
            retVal[i] = this.items.get(i);

        }


        return retVal;
    }
}
