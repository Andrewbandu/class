import java.util.Scanner;


public class Buyer {
    //капітал
    private int capital;

    //конструктор
    public Buyer(int capital) {
        this.capital = capital;


        // метод для встановлення капіталу з клавіатури
    }

    public void setBuyer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введіть капітал:");
        this.capital = scanner.nextInt();

    }

    public int getCapital() {
        return capital;
    }


}









