package collections.Leest;

import java.util.Iterator;
import java.util.Vector;

public class Vektor {
    public static void main(String[] args) {
        Vector<Integer> nums = new Vector<>();

        // Randomly add elements to the vector
        for (int i = 0; i < 10; i++) {
            nums.add((int)(Math.random() * 1000));
        }

        System.out.println(nums);
//        System.out.println(nums.get(3));

        Iterator<Integer> i = nums.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + ", ");
        }
    }
}
/*
vector is a growable array of objects.

Methods of vector:
Same as ArrayList except that all the methods of vector are synchronized.
*/