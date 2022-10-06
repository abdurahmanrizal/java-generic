package abdurahman.generic.util;

public class ArrayHelper {
    public static <T> int count(T[] array) {
        return array.length;
    }

    public static int sumArr(int[] array) {
        int total = 0;
        for (var i : array){
            total += i;
        }
        return total;
    }
}
