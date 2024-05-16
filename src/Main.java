
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //створення обєкту класу BUYER
        Buyer buyer = new Buyer(0);
        //встановлення капіталу з кклавіатури
        buyer.setBuyer();
        //виводимо капітал покупця
        System.out.println("капітал покупця: " + buyer.getCapital() + "$");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть  назву автомобіля: ");
        String CarDealership = scanner.nextLine();

            String a = "BMW";
            String a1 = "Mercedes-Benz";
            if (CarDealership.equals(a)) {
                System.out.println("Введіть модель автомобіля:");
                String BMW = scanner.nextLine();
                String b = "M2";
                String b1 = "M3";
                String b2 = "X5";
                if (BMW.equals(b)) {
                    BMW auto = new BMW("M2 ", 5.5, 2012, 1500, "sport", 15000);

                } else if (BMW.equals(b1)) {
                    BMW auto = new BMW("M3 ", 5.4, 2020, 1700, "sport", 13445);

                } else if (BMW.equals(b2)) {
                    BMW auto = new BMW("X5 ", 5.4, 2020, 1700, "sport", 13445);

                } else {
                    System.out.println("такої моделі немає в наявності");
                }


            } else if (CarDealership.equals(a1)) {
                System.out.println("введіть модель автомобіля:");
                String Mercedes_Benz = scanner.nextLine();
                String c = "S-class";
                String c1 = "C-class";
                if (Mercedes_Benz.equals(c)) {
                    Mercedes_Benz auto = new Mercedes_Benz("S-class ", 5.5, 2012, 1500, "sport", 15000);
                } else if (Mercedes_Benz.equals(c1)) {
                    Mercedes_Benz auto = new Mercedes_Benz("C-class ", 5.5, 2012, 1500, "sport", 15000);


                } else {
                    System.out.println("такої моделі немає в наявності");
                }

            } else {
                System.out.println("такох марки немає в наявності ");
            }



    }
}