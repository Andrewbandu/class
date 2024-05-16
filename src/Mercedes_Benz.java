public class Mercedes_Benz  extends CarDealership {
    public Mercedes_Benz(String model, double volume, int year, double weight, String comp, int price){
        super(model, volume, year, weight, comp, price);

    }

    public String information(){
        System.out.println("Інформація про Mercedes-Benz");
        String info = "Модель: " + model + " Об'єм двигуна: " + volume + " Рік випуску: " + year + " Вага:" + weight + " Комплектація: " + comp + " Ціна: " + price + "$";


        return info;
    }

}
