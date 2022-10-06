package abdurahman.generic.application;

public class MultiConstraintApp {
    public static void main(String[] args) {
       Data<VicePresident> vicePresidentData = new Data<>(new VicePresident());
//       VicePresident vicePresident = new VicePresident();

        vicePresidentData.setData(vicePresidentData.data);
    }

    public static interface CanSayHello {
      void sayHello(String name);
    }

    public static interface canSayLove {
       void sayLove(String name);
    }
    public static abstract class Employee {

    }

    public static class Manager extends Employee {
        private String name;
        public Manager(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class VicePresident extends Employee implements CanSayHello, canSayLove {

        @Override
        public void sayHello(String name) {
            System.out.println("Hello " + name);

        }

        public void sayLove(String name) {
            System.out.println( "Hello " + name + ", i love you");
        }
    }

    public static class Data<T extends  Employee & CanSayHello & canSayLove> {
        private T data;

        public Data(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data.sayHello("Rahman");
            this.data.sayLove("Felly");
            this.data = data;
        }
    }
}
