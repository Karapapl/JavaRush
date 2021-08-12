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

class Quest_5_2 {
  public static void main(String [] args) {
    Scanner console = new Scanner(System.in);
    System.out.println("Введите первое число:");
    int number1 = console.nextInt();
    System.out.println("Введите второе число:");
    int number2 = console.nextInt();
    System.out.println("Введите третье число:");
    int number3 = console.nextInt();

    if ((number1 == number2) && (number2==number3))
      System.out.println(number1 + " " + number2 + " " + number3);
    else if (number1 == number2)
      System.out.println(number1 + " " + number2);
    else if (number1 == number3)
      System.out.println(number1 + " " + number3);
    else if (number2 == number3)
      System.out.println(number2 + " " + number3);
    else
      System.out.println("Введенные числа не равны.");
    console.close();
  }
}