
public class CarDealership {
    //назва автомобіля

    public String model;
    //об'єм двигуна
    public double volume;
    //рік випуску
    public int year;
    //вага автомобіля
    public double weight;
    //комплектація автомобіля
    public String comp;
    //ціна авто
    public int price;
    //конструктор
    public CarDealership(String model, double volume, int year, double weight, String comp, int price){
        this.model = model;
        this.volume = volume;
        this.year = year;
        this.weight = weight;
        this.comp = comp;
        this.price = price;
        System.out.println(information());



    }

    public String information() {
        String info = "Модель:" + model + " Об'єм двигуна:" + volume + " Рік випуску:" + year + " Вага:" + weight + " Комплектація:" + comp + " Ціна:" + price +"$" ;

        return info;



    }

}
