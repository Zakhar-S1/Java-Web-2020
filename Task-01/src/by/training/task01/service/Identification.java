package by.training.task01.service;

public class Identification {

    public boolean typeOfYear(int year) {

        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            return true;
        } else return false;

    }

    public int quantityOfDays(int numberOfMonth, boolean isLeapYear) {

        if (numberOfMonth == 2 && isLeapYear) {
            return 28;
        } else if (numberOfMonth == 2) {
            return 29;
        } else if (numberOfMonth == 4 || numberOfMonth == 6 || numberOfMonth == 9 || numberOfMonth == 11) {
            return 30;
        } else return 31;

    }

}

