package by.training.task01.view;

import java.util.Scanner;
import java.time.Month;

public class DataIO {

    public int readYearNumber(){

        Scanner in = new Scanner(System.in);
        System.out.print("Please, enter the year number:");
        return in.nextInt();

    }

    public int readMonthNumber(){

        Scanner in = new Scanner(System.in);
        System.out.print("Please, enter the month number:");
        return in.nextInt();

    }

    public void printTypesOfYear(boolean isLeapYear, int year){

        if (isLeapYear) {
            System.out.println("The year " + year + " is a leap year.");
        } else System.out.println("The year " + year + " is not a leap year.");

    }

    public void printQuantityOfDays(int numberOfMonth, int daysInMonth){

        System.out.print(Month.of(numberOfMonth) + " has " + daysInMonth + " days.");

    }
}
