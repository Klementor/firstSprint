package YandexProject;
public class StepTracker {

    int bestSeries = 0 ;
    int bestSeriesTemp = 0;
    int averageSteps = 0;
    Converter converter = new Converter();

    void stepsEveryDay(int month, int date[][], int stepTarget) {
        for (int i = 0; i < 30; i++) {
            System.out.println("День " + i + ". Вы прошли " + date[month][i] + " шагов");
        }

     int sumSteps = 0;
     for (int i = 0; i < 30; i++) {
         sumSteps= sumSteps +  date[month][i];
     }
     System.out.println("Сумма шагов в этом месяце составила: " + sumSteps + " шагов");


     int maxExpense = 0;
     for (int i = 0; i < 30; i++) {
         if (date[month][i] > maxExpense) {
             maxExpense = date[month][i];
         }
     }
     System.out.println("Наибольшее количество шагов в день за месяц составило " + maxExpense);


        averageSteps = sumSteps / 30;
        System.out.println("Среднее количество шагов в этом месяце было: " + averageSteps);


        converter.convert(sumSteps);


        for (int i = 0; i < 30; i++) {
            if (date[month][i] >= stepTarget) {
                bestSeriesTemp++;
            } else {
                if (bestSeriesTemp > bestSeries) {
                    bestSeries = bestSeriesTemp;
                }
            }
        }
        System.out.println("Лучшая серия: "+ bestSeries);
    }
}


