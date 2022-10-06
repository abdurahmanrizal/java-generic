package abdurahman.generic.application;

import abdurahman.generic.Person;

import java.util.Arrays;

public class ComparableApp {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Zainal", "Vanuatu"),
                new Person("Felly", "Indonesia"),
                new Person("Abdurahman", "Zimbabwe"),
        };

        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
    }
}
