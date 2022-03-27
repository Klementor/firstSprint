package YandexProject;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            StepTracker stepTracker= new StepTracker();
            Scanner scanner = new Scanner(System.in);

            printMenu();
            int command = scanner.nextInt();

            int [][] dateMonth = new int[12][30];
            int stepTarget = 10000;


            while (command != 0) {

                if (command == 1) {

                    System.out.println("За какой месяц вы хотите внести данные начиная с 0 месяца?");
                    int month = scanner.nextInt();
                    System.out.println("За какой день вы хотите внести данные?");
                    int day = scanner.nextInt();
                    System.out.println("Сколько шагов вы прошли?");
                    int steps = scanner.nextInt();
                    dateMonth[month][day]+=steps;
                    System.out.println("Значение сохранено! Количество шагов в "+ month +" месяце, "+ day +" числа составило: "+  dateMonth[month][day]);

                }  else if (command == 2) {
                    System.out.println("За какой месяц начиная с 0 вы хотите посмотреть шаги?");
                    int month = scanner.nextInt();
                    stepTracker.stepsEveryDay(month, dateMonth,stepTarget);

                } else if (command == 3) {
                    System.out.println("Какую новую цель по шагам вы хотите себе поставить?");
                    int stepTargetTemp = scanner.nextInt();
                    if (stepTargetTemp < 0){
                        System.out.println("Лень, конечно, двигатель прогресса, но идти в обратную сторону такая себе затея((");
                    } else {
                        stepTarget = stepTargetTemp;
                        System.out.println("Отлично, теперь ваша цель по шагам:" + stepTarget );
                    }

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
