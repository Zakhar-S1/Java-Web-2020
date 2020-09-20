package by.training.task01.controller;

import by.training.task01.service.Identification;
import by.training.task01.view.DataIO;

public class Main {

    public static void main(String[] args) {

        DataIO dataIO = new DataIO();
        Identification identification = new Identification();

        int year = dataIO.readYearNumber();
        int numberOfMonth = dataIO.readMonthNumber();

        boolean isLeapYear  = identification.typeOfYear(year);
        int daysInMonth = identification.quantityOfDays(numberOfMonth, isLeapYear);

        dataIO.printTypesOfYear(isLeapYear, year);
        dataIO.printQuantityOfDays(numberOfMonth, daysInMonth);

    }
}
