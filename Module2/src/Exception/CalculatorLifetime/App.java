package Exception.CalculatorLifetime;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhap ngay sinh : ");
            int day = scanner.nextInt();

            System.out.print("Nhap thang sinh : ");
            int month = scanner.nextInt();

            System.out.print("Nhap nam sinh : ");
            int year = scanner.nextInt();

            Calculator calculator = new Calculator(day, month, year);
            long daysLived = calculator.calculateDaysLived();
            System.out.println("Bạn đã sống được " + daysLived + " ngày");
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }

        scanner.close();
    }
}
