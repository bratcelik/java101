package CollectionAndMap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        //List<Integer> liste = new ArrayList<>(); -> polymorphism
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(1);
        list.add(null);
        list.add(4);
        list.add(5);

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("#######################");
        for (Integer element : list){
            System.out.println(element);
        }


        System.out.println("List has " + list.size() + " elements." );

        System.out.println(list.get(4));

        //System.out.println(list.get(100));

    }
}
