package ponchitaz.io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainTask {

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

            // TODO: Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
            System.out.println("Wanna play a game? Whatever, pick a number: ");
            int amount = scanner.nextInt(); // Get an amount of random numbers
            //double[] randomArray = new double[amount]; // If we want a list of random doubles
            int[] randomArray = new int[amount];
            int i; // Just a counter
            for (i = 0; i < amount; i++) {
                Random randomizer = new Random();
                int randomNumber = randomizer.nextInt();
                randomArray[i] = randomNumber;
            }
            String newLine = System.getProperty("line.separator"); // Separate the output lines
            System.out.println("You know, what? Here, " + amount + " random numbers just for you!" + newLine + Arrays.toString(randomArray));
            System.out.println("Want to see them as a list? You're welcome!");
            Arrays.stream(randomArray).forEach(System.out::println);

            // TODO: Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
            System.out.println("Want more? Not a question!");
        }

    }
}
