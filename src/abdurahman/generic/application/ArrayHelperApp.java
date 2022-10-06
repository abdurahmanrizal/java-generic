package abdurahman.generic.application;

import abdurahman.generic.util.ArrayHelper;

public class ArrayHelperApp {
    public static void main(String[] args) {
        String[] names = {"Abdurahman","Rizal", "Golang"};
        int[] numbers = {1,2,3};
        System.out.println(ArrayHelper.<String>count(names));
        System.out.println(ArrayHelper.sumArr(numbers));
    }
}
