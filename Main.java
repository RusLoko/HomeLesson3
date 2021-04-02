import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random numbers = new Random();
        int tryInputs = 0;
        int random = numbers.nextInt(9);
        System.out.print("Угадай число с трех раз,");
        while (tryInputs < 3) {
            System.out.println("Введите число от 0 до 9:");
            int number = input.nextInt();
            if (number > random) {
                System.out.println("Вы ввели большее число, попробуйте поменьше:");
                System.out.println();
            } else if (number < random) {
                System.out.println("Вы ввели меньшее число, попробуйте побольше:");
                System.out.println();
            } else if (number == random) {
                System.out.println("Ура! Вы отгадали!");
                System.out.println();
                return;
            }
            tryInputs++;
        }
        System.out.print("К сожалению, ваши попытки закончились. Начать игру заново? Да? жми 1; Нет? нажми 0:");

        String userData = input.next();

        if (userData.equals("1")) {
            main(null);
        }
    }
}

