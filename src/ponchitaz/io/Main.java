package ponchitaz.io;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    try (Scanner scanner = new Scanner(System.in)) {

            // TODO: Приветствовать любого пользователя при вводе его имени через командную строку.
            System.out.println("Anybody here? What's your name? "); //We ask a name
            String name = scanner.nextLine(); // Parsing a string from user input to get a name
            System.out.println("Oh, hi " + name + "!"); // Saying "Hello"

            // TODO: Отобразить в окне консоли аргументы командной строки в обратном порядке.
            String reversedName = new StringBuilder(name).reverse().toString(); // Reversing the given name
            // We get the final name in correct case by making the first letter capital and completing the name with the rest of it in lower case
            String finalRevName = Character.toString(reversedName.toLowerCase().charAt(0)).toUpperCase()+reversedName.toLowerCase().substring(1);
            System.out.println("Or should i say: " + finalRevName + ", haha? Isn't it funny, " + finalRevName + "?"); // Joking

            //TODO: Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

        }

    }
}
