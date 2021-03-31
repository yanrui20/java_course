package data;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyDate date = new MyDate(1, 1, 1);
        date.showDate();
        date.setDate(28, 2, 2020);
        date.showDate();
        date.addDay();
        date.showDate();
        date.addDay();
        date.showDate();
    }
}
