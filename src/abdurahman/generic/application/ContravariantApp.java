package abdurahman.generic.application;

import abdurahman.generic.MyData;

public class ContravariantApp {
//    aman untuk set data tapi tidak aman untuk get data => contravariant
    public static void main(String[] args) {
        MyData<Object> objectMyData = new MyData<>("Rahman");

        MyData<? super String> myData = objectMyData;

        process(objectMyData);

        System.out.println(myData.getData());
    }

    public static void process(MyData<? super String> myData) {
        myData.setData("Abdurahman");

    }
}
