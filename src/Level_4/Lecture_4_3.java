package Level_4;

import java.util.Scanner;

public class Lecture_4_3 {
}

class Quest_4_3_1 {
  public static void main(String[] args) {
    String quote = "Я никогда не буду работать за копейки. Амиго";
    int x = 0;
    while (x != 100) {
      System.out.println(quote);
      x++;
    }
  }
}

class Quest_4_3_2 {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.println("Введите своё имя:");
    String name = console.nextLine();
    String text = " любит меня";
    int x = 0;
    while (x != 10) {
      System.out.println(name + text);
      x++;
    }
    console.close();
  }
}

class Quest_4_3_3 {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    int x = 0;
    String input = "";
    String stop = "ENTER";
    while (!stop.equals(input)) {
      if (console.hasNextInt()) {
        x = x + console.nextInt();
      } else input = console.nextLine();

    }
    System.out.println(x);
    console.close();
  }
}

class Quest_4_3_4 {
  public static void main(String[] args) {
    int a = 0;
    while (a != 5) {
      int b = 0;
      while (b != 10) {
        System.out.print("Q");
        b++;
      }
      System.out.println();
      a++;
    }

  }
}

class Quest_4_3_5 {
  public static void main(String[] args) {
    int height = 1;

    while (height <= 10) {
      int widht = 1;
      while (widht <= 20) {
        if ((height == 1) || (height == 10)) {
          System.out.print("Б");
          widht++;
        } else if (widht == 1 || widht == 20) {
          System.out.print("Б");
          widht++;
        } else {
          System.out.print(" ");
          widht++;
        }
      }
      height++;
      System.out.println();
    }

  }
}