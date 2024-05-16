public class BMW extends CarDealership {
    //
    public BMW(String model, double volume, int year, double weight, String comp, int price){
        super(model, volume, year, weight, comp, price);

    }




    @Override//перевизначає метод з батьківського класу
    public String information(){
        System.out.println("Інформація про BMW");
        String info = "Модель: " + model + " Об'єм двигуна: " + volume + " Рік випуску: " + year + " Вага:" + weight + " Комплектація: " + comp + " Ціна: " + price + "$";

        return info;

    }



}
