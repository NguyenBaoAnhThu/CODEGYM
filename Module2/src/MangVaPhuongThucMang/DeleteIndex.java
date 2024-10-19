package MangVaPhuongThucMang;
import java.util.Arrays;
public class DeleteIndex {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 1 ;
        array[1] = 2 ;
        array[2] = 3 ;
        array[3] = 4 ;
        array[4] = 5 ;
//        int [] newArray = new int [array.length-1];
//        int index = 3 ;
//        for ( int i = 0 ; i < array.length ; i++ ){
//            if ( i < index){
//                newArray[i] = array[i];
//            }else {
//                if ( i == array.length-1){
//                    break;
//                }
//                newArray[i] = array[i+1];
//            }
//        }
//        array = newArray;
//        System.out.println(Arrays.toString(array));
        int[]newArray = new int[array.length - 3];
        for ( int i = 0 ; i < newArray.length; i ++ ){
            newArray[i] = array [i < 1 ? i : i + 3];
        }for (int i = 0; i < newArray.length; i++) {
            if (i < 1) {
                newArray[i] = array[i];
            } else {
                // Nếu i lớn hơn hoặc bằng 1, sao chép phần tử từ mảng cũ sang mảng mới,
                // nhưng ta cần bỏ qua 3 phần tử từ vị trí 1 đến 3 trong mảng cũ.
                // Vì vậy, ta cần thêm 3 vào chỉ mục của phần tử cần sao chép trong mảng cũ.
                newArray[i] = array[i + 3];
            }
        }
        array = newArray;
        System.out.println(Arrays.toString(array));
    }
}
