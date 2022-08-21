package CollectionAndMap;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

    public static void main(String[] args) {
        HashSet<Integer> hSet = new HashSet<>();

        hSet.add(10);
        hSet.add(20);
        hSet.add(30);
        hSet.add(10);
        hSet.add(10);
        hSet.add(null);
        hSet.add(null);
        hSet.add(null);

        System.out.println(hSet.size());
        System.out.println(hSet.isEmpty());

        System.out.println(hSet.contains(20));
        System.out.println(hSet.contains(1));

        hSet.remove(20);

        Iterator<Integer> it = hSet.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

        HashSet<String> mySet = new HashSet<>();

    }
}
