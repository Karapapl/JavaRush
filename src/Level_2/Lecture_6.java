package Level_2;

import java.util.Scanner;

public class Lecture_6 {
  public static void main(String[] args) {
    String s1 = "It", s2 = "Just", s3 = "Do";
    String tagline = s2 + s3 + s1;
    System.out.println(tagline);

  }
}

class Quest_6_2 {
  public static void main(String[] args) {
    String emptiness = "пустота";
    String fullnes = emptiness + " " + emptiness + " " + emptiness;
    System.out.println(fullnes);
  }
}

class Quest_6_3 {
  public static void main(String[] args){
    int x = 2;
    int y = 4;
    int z = 0;
    String digits = x + y + "" + z;
    System.out.println(digits);
  }
}

class Quest_6_4 {
  public static void main (String[] args){
    String bigAmount = "500";
    String greatAmount = "100000";
    int hugeAmount = Integer.parseInt(bigAmount) + Integer.parseInt(greatAmount);
    System.out.println(hugeAmount);
  }
}

class Quest_6_5 {
  public static void main(String [] args){
    String emptyString = "";

    //напишите тут ваш код
    System.out.println(emptyString.length());
    System.out.println(("Gomu Gomu no Bazooka!").length());
    System.out.println((emptyString + 2 + 2 + "22").length());
  }
}

class Quest_6_6 {
  public static void main(String [] args){
    String caps = "if I type in caps ";
    String usa = "сша";

    //напишите тут ваш код
    System.out.println((usa).toUpperCase());
    System.out.println(("Винни Пух").toUpperCase());
    System.out.println((caps + "they know I mean business").toUpperCase());
  }
}

class Quest_6_7 {

  public static void main(String[] args) {
    String title = "Senior Lead Principal Software Engineer Data Architect";
    String degree = "In college, I Majored in Political Science and Minored in Religious Studies.";
    String career = "Experienced Team Leader with strong Organizational Skills and a Successful career in Management.";

    //напишите тут ваш код
    System.out.println(("RESUME").toLowerCase());
    System.out.println(("TITLE: " + title).toLowerCase());
    System.out.println(("DEGREE: " + degree).toLowerCase());
    System.out.println(("CAREER: " + career).toLowerCase());
  }
}

class Test_Quest_6_8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner("Люблю тебя, Петра творенье,\n" +
            "Люблю твой строгий, стройный вид,\n" +
            "Невы державное теченье,\n" +
            "Береговой ее гранит");
    String s = scanner.nextLine();
    System.out.println(s);
    s = scanner.nextLine();
    System.out.println(s);
    s = scanner.nextLine();
    System.out.println(s);
    s = scanner.nextLine();
    System.out.println(s);
  }
}

class Test_Quest_6_9 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите число:");
    if (sc.hasNextInt()) {
      int number = sc.nextInt();
      System.out.println("Спасибо! Вы ввели число " + number);
    } else {
      System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
    }

  }
}

class Test_Quest_6_10 {
  public static void main(String[] args) {
    Scanner scan = new Scanner("На голой ветке'" +
            "Ворон сидит одиноко.'" +
            "Осенний вечер." +
            "''***''" +
            "В небе такая луна,'" +
            "Словно дерево спилено под корень:'" +
            "Белеет свежий срез." +
            "''***''" +
            "Как разлилась река!'" +
            "Цапля бредет на коротких ножках,'" +
            "По колено в воде.");

    scan.useDelimiter("'");

    while (scan.hasNext()) {
      System.out.println(scan.next());
    }

    scan.close();
  }
}