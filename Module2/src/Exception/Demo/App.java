package Exception.Demo;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
//        System.out.println(calculator.add(3,5));
//        try {
//            System.out.println(calculator.divide(3,4));
//            System.out.println(calculator.divide(3,0));
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//        System.out.println(calculator.add(3,4));


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = scanner.nextInt();
        System.out.println("Enter b : ");
        int b = scanner.nextInt();
        try {
            System.out.println(calculator.divide(a,b));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Done");
        }
    }
}
