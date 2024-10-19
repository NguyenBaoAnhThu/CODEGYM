//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//public class Main {
//     public static void main(String[] args) {
//         int a = 20 ;
//         System.out.println("Các ước của số " + a + "là: ");
//         for (int i = 1; i <= a; i++) {
//             if (a%i==0){
//                 System.out.println(i);
//             }
//         }
//     }
// }



import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("a : ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt() ;
        System.out.println("b : ");
        int b = input.nextInt();
        int c = 1 ;
        for (int i = 1; i <= a && i <= b ; i++) {
            if ( a%i==0 && b%i ==0 ){
                c = i ;
            }
        }
        System.out.println("UCLN của a và b là :  " + c);
    }
}