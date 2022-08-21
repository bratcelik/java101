package CollectionAndMap;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

    public static void main(String[] args) {
        LinkedHashSet<Integer> lHashSet = new LinkedHashSet<>();

        lHashSet.add(10);
        lHashSet.add(10);
        lHashSet.add(20);
        lHashSet.add(30);

        Iterator<Integer> it = lHashSet.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
