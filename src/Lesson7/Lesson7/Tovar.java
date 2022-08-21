package Lesson7.Lesson7;

// 8.47 ЗА СЧЕТ СОЗДАНИЯ НОВОГО класса мы создали новый тип
public class Tovar {
  // 12:02 !!!
    // переменные (поля класса), описывающие состояние объекта, характеристики

  // ПЕРЕЧИСЛЯЕМ ВАЖНЫЕ НАМ ХАР-КИ, ОПИСАНИЕ СОСТОЯНИЯ ДАННОГО (Tovar) - ОБЪЕКТА
  private   int id;
    private int fullprice;
    private int saleprice;
    private String name;

    public void setId (int idToSafe){
      id = idToSafe;
    }
    public void setFullprice(int newFullPrice){
      fullprice = newFullPrice;
    }

}
