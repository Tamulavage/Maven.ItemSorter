package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class NameComparator implements Comparator<Item> {

    public int compare(Item compareVal1, Item compareVal2) {

        return compareVal1.getName().compareTo(compareVal2.getName());
    }
}
