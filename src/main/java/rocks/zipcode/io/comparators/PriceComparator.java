package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class PriceComparator implements Comparator<Item> {

    public int compare(Item compareVal1, Item compareVal2) {


        return compareVal1.getPrice().compareTo(compareVal2.getPrice());

        //*****LONG WAY BELOW***********/
        /*
        double temp = compareVal1.getPrice() -compareVal2.getPrice();
       if(temp< 0)
        {
            temp--;
        }
       else if (temp > 0){
           temp++;
       }


        System.out.println(temp);

        return (int) temp ;
        */

    }
}
