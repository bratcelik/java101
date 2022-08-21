package CollectionAndMap;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {


        //TreeSet<Student> students = new TreeSet<>(new OrderNameComparator());

        //TreeSet<Student> students = new TreeSet<>(new OrderNoteComparator());

        TreeSet<Student> students = new TreeSet<>(new OrderNameComparator().reversed());



        students.add(new Student("Mustafa",20));
        students.add(new Student("Ahmet",100));
        students.add(new Student("Behlül",45));
        students.add(new Student("Damla",60));
        students.add(new Student("Cemre",70));

        for (Student stu : students){
            System.out.println(stu.getName());
        }

    }

}
