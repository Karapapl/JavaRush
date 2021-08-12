package Level_2;

import java.util.Scanner;

public class Lecture_8 {
  //пробный
  public static void main (String[] args) {
    System.out.println("Введите имя и возраст:");
    Scanner console = new Scanner(System.in);
    String name = console.nextLine();
    int age = console.nextInt();

    System.out.println("Name " + name + " " + "Age " + age);
  }
}

class Quest_8_1 {
  public static void main (String[] args){
    Scanner console = new Scanner(System.in);
    String a = console.nextLine();
    String b = console.nextLine();
    String c = console.nextLine();

    System.out.println(c);
    System.out.println((b).toUpperCase());
    System.out.println((a).toLowerCase());

  }
}

class Quest_8_2 {
  public static void main(String[] args){
    Scanner console = new Scanner(System.in);
    int a = console.nextInt();
    int b = console.nextInt();
    int c = console.nextInt();

    System.out.println("Среднее арифметическое число равно " + ((a + b + c)/3));
  }
}

class Quest_8_3 {
  public static void main(String[] args)
  {
    String str = "10 20 40 60";
    Scanner scanner = new Scanner(str);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(a + b);
  }
}