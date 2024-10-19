package Exception.CalculatorLifetime;

import java.time.LocalDate;
import java.time.Period;


public class Calculator {

    private int day;
    private int month;
    private int year;

    public Calculator(int day, int month, int year) throws Exception {
        if (day < 1 || day > 31) {
            throw new Exception("Ngày không hợp lệ ");
        }
        if (month < 1 || month > 12) {
            throw new Exception("Tháng không hợp lệ  ");
        }
        if (year < 1 || year > LocalDate.now().getYear()) {
            throw new Exception("Năm không hợp lệ  ");
        }

        if (day > 28 && month == 2) {
            if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
                throw new Exception("Nam nhuận tháng 2 có 29 ngày ");
            }
        }
        if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
            throw new Exception(" Tháng" + month + " Không có ngay 31 ");
        }

        this.day = day;
        this.month = month;
        this.year = year;
    }
    public long calculateDaysLived() {
        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getDays()
                + Period.between(birthDate, currentDate).getMonths() * 30
                + Period.between(birthDate, currentDate).getYears() * 365;
    }
}