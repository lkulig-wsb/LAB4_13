import MyPacakage1.Car;

public class Main {
    public static void main(String[] args) {

        System.out.printf(" -- Car Catalogue -- \n");

        //Utworzenie kilku obiektów
        Car c1 = new Car("Ford","C-Max Grand",2011,202150);
        Car c2 = new Car("Mazda", "MX-5",2022, 12000);
        Car c3 = new Car("Toyota","Auris", 2019, 102540);
        Car c4 = new Car("Seat","Leon", 2009, 314000);
        Car c5 = new Car("BMW","M3", 2002, 250678);

        //Wyświetlenie utworzonych obiektów
        c1.wyswietlInfo();
        c2.wyswietlInfo();
        c3.wyswietlInfo();
        c4.wyswietlInfo();
        c5.wyswietlInfo();
    }
}