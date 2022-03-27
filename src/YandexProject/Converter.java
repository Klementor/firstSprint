package YandexProject;

public class Converter {
    double step = 0.75;
    double caloriesByStep = 50;
    double inOneKilocalories = 1000;

    double getDistanceBySteps(int sumSteps){
        return sumSteps * step;
    }
    double getKilocaloriesBySteps(int sumSteps){
        double calories = sumSteps * caloriesByStep;
        return calories / inOneKilocalories;
    }
}
