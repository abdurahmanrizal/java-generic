package abdurahman.generic.application;

import abdurahman.generic.MyData;

public class CovariantApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("Abdurahman");
        process(stringMyData);
    }

    public static void process(MyData<? extends Object> myData) {
        System.out.println(myData.getData());
//        myData.set("Rizal"); // tidak boleh, karena berbahaya
    }
}
