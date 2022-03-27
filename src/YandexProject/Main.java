package YandexProject;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            StepTracker stepTracker= new StepTracker();
            Scanner scanner = new Scanner(System.in);
            printMenu();
            int command = scanner.nextInt();
            int [] date = new int[360];



            while (command != 0) {

                if (command == 1) {

                    System.out.println("За какой месяц вы хотите внести данные начиная с 0 месяца?");
                    int month = scanner.nextInt();
                    System.out.println("За какой день вы хотите внести данные?");
                    int day = scanner.nextInt();
                    System.out.println("Сколько шагов вы прошли?");
                    int steps = scanner.nextInt();
                    date [(month)*30+day]=date [(month)*30+day]+steps;
                    System.out.println("Значение сохранено! Количество шагов в "+ month +" месяце, "+ day +" числа составило: "+  (date[(month)*30+day]));
                }  else if (command == 2) {
                    System.out.println("За какой месяц начиная с 0 вы хотите посмотреть шаги?");
                    int month = scanner.nextInt();
                    stepTracker.stepsEveryDay(month, date);

                } else if (command == 3) {

                } else if (command == 0) {
                    System.out.println("Выход");
                    break;
                } else {
                    System.out.println("Извините, такой команды пока нет.");
                }
                printMenu();
                command = scanner.nextInt();
            }
        }

    private static void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - Ввести количество шагов за определённый день");
        System.out.println("2 - Напечатать статистику за определённый месяц");
        System.out.println("3 - Изменить цель по количеству шагов в день");
        System.out.println("0 - Выйти из приложения");
    }
}
