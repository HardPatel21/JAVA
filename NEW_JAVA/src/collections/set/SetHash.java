package collections.set;

import java.util.HashSet;

public class SetHash {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);

//         System.out.println(hs);
//         System.out.println(hs.contains(20));
//         hs.clear();
//         System.out.println(hs.isEmpty());
//         System.out.println(hs.size());
//         hs.remove(3);
//         System.out.println(hs);
//
//        clone
//         HashSet<Integer> hs1 = (HashSet<Integer>)hs.clone();
//         System.out.println(hs1);
//
//        spliterator
//
//         Spliterator<Integer> s = hs.spliterator();
//         s.forEachRemaining(n -> System.out.println(n));
//         s.tryAdvance(System.out::println);
//         s.tryAdvance(System.out::println);
//         s.tryAdvance(System.out::println);
    }
}
/*

> contains no duplicates
> use hashing to store data
> non synchronized
> doesn't maintain insertion order
> best in search operations

Methods of HashSet class:

1. add() - add element to the HashSet
2. clear() - remove all elements from the HashSet
3. clone() - return a shallow copy of the HashSet
4. contains() - return true if the HashSet contains the specified element
5. isEmpty() - return true if the HashSet is empty
6. remove() - remove the specified element from the HashSet
7. size() - return the number of elements in the HashSet
8. spliterator() - return a Spliterator over the elements in the HashSet


*/