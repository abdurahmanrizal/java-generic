package abdurahman.generic.application;

import abdurahman.generic.MyData;
import abdurahman.generic.Pair;

public class GenericClassApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<String>("Abdurahman");
        MyData<Integer> integerMyData = new MyData<Integer>(10000);

        String stringValue = stringMyData.getData();
        Integer integerValue = integerMyData.getData();

        System.out.println(stringValue);
        System.out.println(integerValue);
    }
}
