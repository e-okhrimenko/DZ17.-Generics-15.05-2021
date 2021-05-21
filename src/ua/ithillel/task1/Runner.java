package ua.ithillel.task1;

import java.util.Arrays;

public class Runner {
    public void run() {
        System.out.println("ПРАКТИЧЕСКАЯ РАБОТА 1.");
        Integer[] intArr = new Integer[]{2, 7, 9, 22, 18, 11, 55};
        Double[] dobArr = new Double[]{5.33, 4.18, 6.11, 15.25, 18.18, 25.42, 11.7};
        System.out.println("Integer[] intArr: " + Arrays.toString(intArr));
        System.out.println("Double[] dobArr: " + Arrays.toString(dobArr));

        System.out.println("MyTestMethod.calcNum(intArr, 5): " + MyTestMethod.calcNum(intArr, 5));
        System.out.println("MyTestMethod.calcNum(dobArr, 5.0): " + MyTestMethod.calcNum(dobArr, 5.0));

        System.out.println("\nПРАКТИЧЕСКАЯ РАБОТА 2.");
        MyTestMethod myTestMethod = new MyTestMethod();
        System.out.format("myTestMethod.calcSum(intArr, 5): %.2f\n", myTestMethod.calcSum(intArr, 5));
        System.out.format("myTestMethod.calcSum(dobArr, 5.0): %.2f\n", myTestMethod.calcSum(dobArr, 5.0));
    }
}
