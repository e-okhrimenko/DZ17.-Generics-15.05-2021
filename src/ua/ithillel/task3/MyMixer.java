package ua.ithillel.task3;

import java.util.Arrays;

public class MyMixer<T> {
    private final T[] ARRAY;

    @Override
    public String toString() {
        return Arrays.toString(ARRAY);
    }

    public MyMixer(T[] array) {
        this.ARRAY = array;
    }

    public void shuffle() {
        int a = (int) (Math.random() * 100) + ARRAY.length;
        while (a-- > -1) {
            int rand1 = (int) (Math.random() * ARRAY.length);
            int rand2 = (int) (Math.random() * ARRAY.length);
            if (rand1 != rand2) {
                T temp = ARRAY[rand1];
                ARRAY[rand1] = ARRAY[rand2];
                ARRAY[rand2] = temp;
            }
        }
    }
}
