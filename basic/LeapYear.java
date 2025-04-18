package InterviewQuestion.basic;

import java.util.Calendar;

public class LeapYear {
    public static boolean isLeapYear(int year){
        //using calendar instance
        Calendar cal = Calendar.getInstance(); //gets Calendar based on local timezone and locale
        cal.set(Calendar.YEAR, year); //setting the calendar year
        int noOfDays = cal.getActualMaximum(Calendar.DAY_OF_YEAR);
      
        if(noOfDays > 365){
            return true;
        }
      
        return false;

        //basic way to find leap year
        // return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        int year = 2020;
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
