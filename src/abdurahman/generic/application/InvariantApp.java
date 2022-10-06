package abdurahman.generic.application;

import abdurahman.generic.MyData;

public class InvariantApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("Abdurahman");
//        MyData<Object> objectMyData = stringMyData; // ERROR

        MyData<Object> objectMyData = new MyData<>(100);
//        MyData<String> stringMyData1 = objectMyData; // ERROR
    }
}
