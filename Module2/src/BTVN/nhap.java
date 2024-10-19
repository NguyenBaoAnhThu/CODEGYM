package BTVN;

import java.util.Arrays;

public class nhap {
    public static void main(String[] args) {
        int[] array = new int[6];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;
        array = removeItemByIndex(5, array);
        System.out.println(Arrays.toString(array));
    }

    static int[] removeItemByIndex(int index, int[] arrayIndex) {
        if (index < 0 || index >= arrayIndex.length) {
            return arrayIndex;
        }
        int[] newArray3 = new int[arrayIndex.length - 1];
        for (int i = 0, j = 0; i < arrayIndex.length; i++) {
            if (i != index) {
                newArray3[j++] = arrayIndex[i];
            }
        }
        return newArray3;
    }
}
