package YandexProject;

public class Converter {
    double step = 0.75;
    double caloriesByStep = 50;
    double inOneKilocalories = 1000;

    void convert(int sumSteps){
        double distance = sumSteps * step;
        double calories = sumSteps * caloriesByStep;
        double kilocalories = calories / inOneKilocalories;
        System.out.println("Пройденная дистанция: "+ distance);
        System.out.println("Сожженые килокалории: "+ kilocalories);
    }
}
