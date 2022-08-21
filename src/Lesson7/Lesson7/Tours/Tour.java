package Lesson7.Lesson7.Tours;

public class Tour {
    private int id;
    private String[] countries = new String[15];
    private int days;
    private String typeOfTransport;
    private int stars;
    private int price;
    private String typeOfService;

    public Tour() {


    }

    public Tour(int id, int days, String typeOfTransport, int stars, int price, String typeOfService) {
        this.id = id;
        this.days = days;
        this.typeOfTransport = typeOfTransport;
        this.stars = stars;
        this.price = price;
        this.typeOfService = typeOfService;

    }

    public void addCountry(String country) {
        // цель - добавить в ассив по странам в ПЕРВУЮ СВОБОДНУЮ ЯЧЕЙКУ
        // ДОПИСАТЬ!!!

        for (int i = 0; i < countries.length; i++) {
            if (countries[i] == null) {
                countries[i] = country;
                break;

            }

        }

    }
    /**
     * на все поля сделать методы SET - устанавливает значение поля
     * на все поля сделать методы GET - вернуть значение поля
     */


}