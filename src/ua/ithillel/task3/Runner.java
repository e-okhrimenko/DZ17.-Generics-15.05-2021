package ua.ithillel.task3;

import java.util.Arrays;

public class Runner {
    public void run() {
        System.out.println("\nПРАКТИЧЕСКАЯ РАБОТА 3.");
        Integer[] intArr = new Integer[]{2, 7, 9, 22, 18, 11, 55};
        String[] strArr = new String[]{"Dania", "Italy", "Sweden", "Albania", "Turkey", "Ukraine", "Moldova"};

        System.out.println("In Integer[]: " + Arrays.toString(intArr));
        System.out.println("In String[]: " + Arrays.toString(strArr));

        MyMixer<? extends Integer> myMixerInt = new MyMixer<>(intArr);
        MyMixer<? extends String> myMixerStr = new MyMixer<>(strArr);

        myMixerInt.shuffle();
        myMixerStr.shuffle();

        System.out.println("Out Integer[]: " + myMixerInt);
        System.out.println("Out String[]: " + myMixerStr);
    }
}