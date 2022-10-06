package abdurahman.generic.application;

import abdurahman.generic.MyData;

public class WildcardApp {
    public static void main(String[] args) {
        print(new MyData<Integer>(1000));
        print(new MyData<String>("Rahman"));
        print(new MyData<String>(new MultiConstraintApp.Manager("Data").getName()));
    }

    public static void print(MyData<?> myData) {
        System.out.println(myData.getData());
    }
}
