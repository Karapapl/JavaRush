package Level_3;

import java.util.Scanner;

public class Lecture_4 {
}

class Quest_4_1 {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.println("Введите возраст:");
    int age = console.nextInt();
    if (age >= 18) {
      if (age < 26)
        System.out.println("Пора в институт");
      else if (age <= 65)
        System.out.println("Пора на работу!");
      else
        System.out.println("Пора на пенсию!");
    } else if (age >= 6)
      System.out.println("Пора в школу!");
    else if (age > 3)
      System.out.println("Пора в садик!");
    else
      System.out.println("Можно отдыхать!");
    console.close();
  }
}


