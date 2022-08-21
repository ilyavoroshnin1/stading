package Lesson7.Lesson7.Tours;

public class MainTour {
    public static void main(String[] args) {
        Tour tour1 = new Tour(1, 5, "Самолет", 5, 120000,"полупансионат");
        Tour tour2 = new Tour(2, 7, "Самолет", 5, 150000,"завтрак");
        Tour tour3 = new Tour(3, 10, "Автобус", 5, 80000,"пансионат");

        tour1.addCountry("Италия");
        tour2.addCountry("Франция");
        tour3.addCountry("Грузия");
        tour3.addCountry("Армения");
    }
}
