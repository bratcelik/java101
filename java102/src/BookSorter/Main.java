package BookSorter;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Set<Book> books = new TreeSet<>();
        Set<Book> books2 = new TreeSet<>(new Comparator<Book>(){
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPages() - o2.getPages();
            }
        });

        books.add(new Book("İlimlerin Sayımı (İhsau'l-Ulum)","Farabi",930,112));
        books.add(new Book("Mukaddime","İbn Haldun",1377,1358));
        books.add(new Book("Introduction to Algorithms","Thomas H. Cormen",1989,1312));
        books.add(new Book("Clean Code","Robert C. Martin",2008,464));
        books.add(new Book("Design Patterns","Erich Gamma",1994,395));

        books2.add(new Book("İlimlerin Sayımı (İhsau'l-Ulum)","Farabi",930,112));
        books2.add(new Book("Mukaddime","İbn Haldun",1377,1358));
        books2.add(new Book("Introduction to Algorithms","Thomas H. Cormen",1989,1312));
        books2.add(new Book("Clean Code","Robert C. Martin",2008,464));
        books2.add(new Book("Design Patterns","Erich Gamma",1994,395));


        System.out.println("A-z Siralama : ");
        for (Book book : books){
            System.out.println(book.getName());
        }

        System.out.println("############\n\n");

        System.out.println("Sayfa sayısına göre Sıralama : ");
        for (Book book : books2){
            System.out.println(book.getName());
        }

    }


}
