import MyPacakage1.Car;

public class Main {
    public static void main(String[] args) {

        System.out.printf(" -- Car Catalogue -- \n");

        /*
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
        */

        //Utworznie tablicy obiektów
        Car[] c = new Car[7];

        //Inicjalizacja elementów tablicy
        c[0] = new Car("Ford","C-Max Grand",2011,202150);
        c[1] = new Car("Mazda", "MX-5",2022, 12000);
        c[2] = new Car("Toyota","Auris", 2019, 102540);
        c[3] = new Car("Seat","Leon", 2009, 314000);
        c[4] = new Car("BMW","M3", 2002, 250678);
        c[5] = new Car("Fiat","500",2011,250150);
        c[6] = new Car("Ford","Mondeo",2017,170670);

        //Wyswietlenie informacji o samochodach z tablicy
        for(Car car : c){
            System.out.println(car.marka + " " + car.model + " " + car.rokProdukcji + " " + car.przebieg);
        }

    }
}