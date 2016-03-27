import java.util.Scanner;

public class NumDays {
  public static void main(String[] args){
    
      for (int i = 2000; i <= 2020; i++)
        System.out.println("Year " + i + " has " + numberOfDaysInAYear(i)
                            + " days.");
  } // main
  
  public static int numberOfDaysInAYear(int year){
    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
      return 366;
    else
      return 365;
  } // numberOfDaysInAYear
} // NumDays
