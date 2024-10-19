package TTChen;

public class main {
    public static void main(String[] args) {

        int [] myArray = {4,6,3,8,10,38,22, 1};
        System.out.println(myArray);

        int len = myArray.length;
        for ( int i = 1; i < len ; i++){
            int newArray = myArray[i];
            int j = i -1 ;

            while (j >= 0 && newArray < myArray[i]){
                myArray[j+1] = myArray[j];
                j--;
            }
        }
    }
}
