package Level_3;

import java.util.Scanner;

public class Lecture_5 {
}


class Quest_5_1 {
  private static boolean isHigh;
  private static boolean isLow;

  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.println("Введите температу тела:");
    double bodyTemperature = console.nextDouble();
    isHigh = bodyTemperature > 37;
    isLow = bodyTemperature < 36;
    if (isHigh)
      System.out.println("Температура тела высокая.");
    else if (isLow)
      System.out.println("Температура тела низкая.");
    else
      System.out.println("Температура тела нормальная.");
    console.close();

  }

}
