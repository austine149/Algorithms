package com.austine.algos;

public class DayOfAProgrammer {
    public static String dayOfProgrammer(int year) {
        // Write your code here
        //check if the year is divisible by 4
        //if its divisible, it denotes its a leap year = 244 days
        //subtract that from the day of a programmer then build the string
        int totalDaysFromJanuary=243;
        int dayOfAprogrammer=256;
        if (year%4 ==0 && year%400==0 && year%100 !=0){
            totalDaysFromJanuary +=1;
        }
        int day=dayOfAprogrammer-totalDaysFromJanuary;

        StringBuilder builder=new StringBuilder();
        builder.append(day);
        builder.append(".");
        builder.append("09");
        builder.append(".");
        builder.append(year);
    return builder.toString();

//        if (year == 1918) {
//            // Special case for the transition year 1918
//            return "26.09.1918";
//        } else if ((year < 1918 && year % 4 == 0) || (year > 1918 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)))) {
//            // Leap year in the Julian or Gregorian calendar
//            return "12.09." + year;
//        } else {
//            // Non-leap year in the Julian or Gregorian calendar
//            return "13.09." + year;
//        }
    }

    public static void main(String[] args) {
//        12.09.2016
        System.out.println(dayOfProgrammer(2016));
    }
}
