package Level_3;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Lecture_3 {

    }

class Quest_3_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите температуру на улице:");
        int t = console.nextInt();
        if (t >= 0)
            System.out.println("На улице тепло.");
        else
            System.out.println("На улице холодно.");
    }
}

//Ввести с клавиатуры имя и возраст. Если возраст в пределах 18-28 (включительно), то вывести надпись "Имя, явитесь в военкомат", где Имя - это имя, введенное ранее с клавиатуры.

class  Quest_3_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = console.nextLine();
        System.out.println("Введите возраст:");
        int age = console.nextInt();

        if (age >=18 && age <=28)
            System.out.println(name + " явитесь в военкомат!");
        else
            System.out.println(name + " можете отдыхать");
        console.close();
    }
}
