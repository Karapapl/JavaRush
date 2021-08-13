package Level_3;

import java.util.Scanner;

public class Lecture_6 {

}

class Quest_6_1 {
  private static final String TRIANGLE_EXISTS = "Треугольник существует";
  private static final String TRIANGLE_NOT_EXISTS = "Треугольник не существует";

  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.println("Введите длинну a:");
    int a = console.nextInt();
    System.out.println("Введите длинну b:");
    int b = console.nextInt();
    System.out.println("Введите длинну c:");
    int c = console.nextInt();

    if ((c < (a + b)) || (a < (b + c)) || (b < (a + c)))
      System.out.println(TRIANGLE_EXISTS);
    else
      System.out.println(TRIANGLE_NOT_EXISTS);
    console.close();
  }
}

class Qeust_6_2 {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.println("Введите Ваш возраст:");
    int age = console.nextInt();
    if ((age < 20) || (age > 60))
      System.out.println("Можно не работать");
    console.close();
  }
}

class Quest_6_3 {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.println("Введите координату x:");
    int x = console.nextInt();
    System.out.println("Введите координату y:");
    int y = console.nextInt();

    if ((x > 0) && (y > 0))
      System.out.println("1");
    else if ((x < 0) && (y > 0))
      System.out.println("2");
    else if ((x < 0) && (y < 0))
      System.out.println("3");
    else if ((x > 0) && (y < 0))
      System.out.println("4");
    console.close();
  }
}

