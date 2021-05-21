package ua.ithillel.task1;

public class MyTestMethod {

    public static <T extends Comparable<T>> int calcNum(T[] arr, T value) {
        int result = 0;
        for (T t : arr) {
            if (t.compareTo(value) > 0) {
                result++;
            }
        }
        return result;
    }

    public <T extends Number & Comparable<T>> double calcSum(T[] arr, T value) {
        double result = 0.0;
        for (T t : arr) {
            if (t.compareTo(value) > 0) {
                result += t.doubleValue();
            }
        }
        return result;
    }
}
