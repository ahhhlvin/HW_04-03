package nyc.c4q.ahhhlvin;

import java.util.ArrayList;
import java.util.Iterator;


/**
 * Created by alvin2 on 3/30/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 *
 * You are given an ArrayList of unknown size containing integers. Write a class called LinearSearch which implements a static method search which accepts as input an ArrayList alist and an integer x, and returns the first index it sees of x in alist. If the integer is not present return in the list return -1
 */

public class LinearSearch {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(3);
        numbers.add(45);
        numbers.add(1);
        numbers.add(2);
        numbers.add(99);

        System.out.println(search(numbers, 99));

    }

    public static int search(ArrayList<Integer> alist, int x) {

        int result = 0;
        Iterator<Integer> arrayIter = alist.iterator();

            for (int i = 0; i < alist.size(); i++) {

                if (arrayIter.next() == x) {
                    result = i;
                    break;
                } else {
                    result = -1;

                }

            }

        return result;


    }
}
