package ua.ithillel.task3;

import java.util.Arrays;

public class MyMixer<T> {
    T[] array;

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    public MyMixer(T[] array) {
        this.array = array;
    }

    public void shuffle() {
        int a = (int) (Math.random() * 100) + array.length;
        while (a-- > -1) {
            int rand1 = (int) (Math.random() * array.length);
            int rand2 = (int) (Math.random() * array.length);
            if (rand1 != rand2) {
                T temp = array[rand1];
                array[rand1] = array[rand2];
                array[rand2] = temp;
            }
        }
    }
}
