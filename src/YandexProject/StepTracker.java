package YandexProject;
public class StepTracker {

    void stepsEveryDay(int month, int date[]) {
        for (int i = month * 30; i < (month * 30) + 30; i++) {
            System.out.println("День " + ((i - (month * 30)) + 1) + ". Вы прошли " + date[i + 1] + " шагов");
        }

     int sumSteps = 0;
     for (int i = month * 30; i < (month * 30) + 30; i++) {
         sumSteps = sumSteps + date[i];
     }
     System.out.println("Сумма шагов в этом месяце составила: " + sumSteps + " шагов");


     int maxExpense = 0;
     for (int i = month * 30; i < (month * 30) + 30; i++) {
         if (date[i] > maxExpense) {
             maxExpense = date[i];
         }
     }
     System.out.println("Наибольшее количество шагов в день за месяц составило " + maxExpense);


        int averageSteps = 0;
        for (int i = month * 30; i < (month * 30) + 30; i++) {
            sumSteps = sumSteps + date[i];
        }
        averageSteps = sumSteps / 30;
        System.out.println("Среднее количество шагов в этом месяце было: " + averageSteps);
    }
}


