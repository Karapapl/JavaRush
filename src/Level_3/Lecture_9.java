package Level_3;

import java.util.Scanner;

public class Lecture_9 {
}

class Quest_3_9_1 {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.println("Введите первое слово:");
    String first = console.nextLine();
    System.out.println("Введите второе слово:");
    String second = console.nextLine();
    if (first.equals(second)) {
      System.out.println("Строки одинаковые");
    } else {
      System.out.println("Строки разные");
    }

    console.close();
  }
}

class Quest_3_9_2 {

  public static String string1 = "Амиго";
  public static String string2 = string1;
  //public static String string3 = new String(string1);

  public static void main(String[] args) {
//актуальный код:
    //System.out.println(string1 == string2 ? "ссылки на строки одинаковые" : "ссылки на строки разные");
    //System.out.println(string1 == string3 ? "ссылки на строки одинаковые" : "ссылки на строки разные");
    //System.out.println(string2 == string3 ? "ссылки на строки одинаковые" : "ссылки на строки разные");

 /*   if (string1 == string2) {
      System.out.println("ссылки на строки одинаковые");
    } else if (string2 == string3) {
      System.out.println("ссылки на строки одинаковые");
    } else if (string1 == string3) {
      System.out.println("ссылки на строки одинаковые");
    } else {
      System.out.println("ссылки на строки разные");
    } */
  }
}

class Quest_3_9_3 {
  public static String secret = "AmIGo";

  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    String password = console.nextLine();

    if (password.equalsIgnoreCase(secret)) {
      System.out.println("Доступ разрешен.");
    } else {
      System.out.println("Доступ запрещен.");
      console.close();
    }
  }
}