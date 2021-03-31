package data;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate() {
    }

    public MyDate(int day, int month, int year) {
        setDate(day, month, year);
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void showDate() {
        System.out.printf("Today: %d/%d/%d\n", day, month, year);
    }

    public void addDay() {
        day++;
        if (day > daysInMonth()) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
    }

    private boolean isRen() {
        if (year % 400 == 0) {
            return true;
        } else {
            return year % 4 == 0 && year % 100 != 0;
        }
    }

    private int daysInMonth() {
        return switch (month) {
            case 2 -> isRen() ? 29 : 28;
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            default -> 30;
        };
    }
}
