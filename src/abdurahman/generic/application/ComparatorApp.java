package abdurahman.generic.application;

import abdurahman.generic.Person;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {
//    comparator digunakan apabila kita tidak dapat akses class, atau class dari orang lain.
//    comparable digunakan apabila kita dapat mengakses class.
    public static void main(String[] args) {
        Person[] people = {
                new Person("Zainal", "Vanuatu"),
                new Person("Felly", "Indonesia"),
                new Person("Abdurahman", "Zimbabwe"),
        };

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Arrays.sort(people, comparator);
        System.out.println(Arrays.toString(people));
    }
}
