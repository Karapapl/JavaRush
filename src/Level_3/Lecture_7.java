package Level_3;

import java.util.Scanner;

public class Lecture_7 {

}

class Quest_3_7_1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите число A:");
    int numberA = scanner.nextInt();
    System.out.println("Введите число B:");
    int numberB = scanner.nextInt();
    int max = Math.max(numberA, numberB); //int max = numberA > numberB ? numberA : numberB;
    System.out.println(max);
    scanner.close();
    /*
            if (numberA > numberB) {
            System.out.println(numberA);
        } else {
            System.out.println(numberB);
        }*/
  }
}

class Quest_3_7_2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите произвольное число:");
    int number = scanner.nextInt();
        /*String result = number < 5 ? : number > 5 ? "число больше 5" : "число равно 5";
        System.out.println(result);*/
    if (number < 5)
      System.out.println("Число меньше пяти.");
    else if (number == 5)
      System.out.println("Число равно пяти.");
    else
      System.out.println("Число больше пяти");
    scanner.close();
  }
}

class Quest_3_7_3 {
  public static void main(String[] args) {

    Scanner console = new Scanner(System.in);
    System.out.println("Введите число 'a':");
    double a = console.nextDouble();
    System.out.println("Введите число 'b':");
    double b = console.nextDouble();

    if ((Math.abs(b - a) < 0.000001))
      System.out.println("Числа равны.");
    else
      System.out.println("Числа не равны.");
    console.close();
  }
}