package YandexProject;
public class StepTracker {

    int bestSeries = 0 ;
    int bestSeriesTemp = 0;
    int averageSteps = 0;
    Converter converter = new Converter();

    void stepsEveryDay(int month, int date[][], int stepTarget) { // Вывод шагов за каждый день выбранного месяца
        for (int i = 0; i < 30; i++) {
            System.out.println( i +" день: " + date[month][i]);
        }

     int sumSteps = 0; // Нахождение суммы шагов за выбранный месяц
     for (int i = 0; i < 30; i++) {
         sumSteps= sumSteps +  date[month][i];
     }
     System.out.println("Сумма шагов в этом месяце составила: " + sumSteps + " шагов");


     int maxExpense = 0; // Нахождение максимального количества шагов в день в течение выбранного месяца
     for (int i = 0; i < 30; i++) {
         if (date[month][i] > maxExpense) {
             maxExpense = date[month][i];
         }
     }
     System.out.println("Наибольшее количество шагов в день за месяц составило " + maxExpense);


        averageSteps = sumSteps / 30; // Нахождение среднего количества шагов
        System.out.println("Среднее количество шагов в этом месяце было: " + averageSteps);


        double distance =  converter.getDistanceBySteps(sumSteps); // Нахождение пройденного пути через класс Converter
        System.out.println("В этом месяце вы прошли "+ distance+ " метров");
        double kilocalories = converter.getKilocaloriesBySteps(sumSteps); // Нахождение потраченных килокалорий через класс Converter
        System.out.println("В этом месяце вы сожгли "+ kilocalories+ " килокалорий");

        for (int i = 0; i < 30; i++) { // Нахождение лучшей серии в течение которой количество шагов за день было равно или выше целевого.
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


