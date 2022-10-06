package abdurahman.generic.application;

public class BoundParameterType {
    public static void main(String[] args) {
        NumberData<Integer> integerNumberData= new NumberData<>(1);
        NumberData<Long> longNumberData = new NumberData<>(1L);
        NumberData<Integer> integerNumberData1 = new NumberData<>(3);

        integerNumberData1.setData(2);
//        NumberData<String> stringNumberData = new NumberData<String>("Rahman"); // ERROR
        System.out.println(integerNumberData.getData());
        System.out.println(integerNumberData1.getData());
    }

    public static class NumberData<T extends Number> {
        private T data;

        public NumberData(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
