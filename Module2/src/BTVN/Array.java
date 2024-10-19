package BTVN;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[6];
        array[0] = 1 ;
        array[1] = 2 ;
        array[2] = 3 ;
        array[3] = 4 ;
        array[4] = 5 ;
        array[5] = 6 ;
        // Xoá các phần tử từ vị trí a -> b
        array = removeItem(1,3,array);
        System.out.println(Arrays.toString(array));
        array = removeItemByIndex(5, array);
        System.out.println(Arrays.toString(array));

    }
    static int[] removeItem(int a, int b, int[] arrayRemove) {
        int countItemRemove = b - a + 1;
        int[] newArray2 = new int[arrayRemove.length - countItemRemove];
        for (int i = 0; i < arrayRemove.length; i++) {
            if (i < a) {
                newArray2[i] = arrayRemove[i]; // [1,0]
            } else {
                if(i == arrayRemove.length - countItemRemove) {
                    break;
                }
                newArray2[i] = arrayRemove[i + countItemRemove];
            }
        }
        arrayRemove = newArray2;
        return arrayRemove;
    }
    // // xoa phan tu theo index
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
