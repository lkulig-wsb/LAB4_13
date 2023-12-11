import MyPacakage1.Car;

public class Main {
    public static void main(String[] args) {

        System.out.println(" -- Car Catalogue -- \n");


        //Utworzenie kilku obiektów
        Car c0 = new Car("Ford","C-Max Grand",2011,202150,5,1993.0,26000.0);
        Car c1 = new Car("Mazda", "MX-5",2022, 12000,3,1998.0, 150000.0);
        Car c2 = new Car("Toyota","Auris", 2019, 102540,5,1798.0,87000.0);
        Car c3 = new Car("Seat","Leon", 2009, 314000,5,1896.0,32000.0);
        Car c4 = new Car("BMW","M3", 2002, 250678,3,2998.0, 180000.0);
        Car c5 = new Car("Fiat","500",2014,250150, 3, 1242.0,31000.0);
        Car c6 = new Car("Ford","Mondeo",2017,170670, 5,2967.0,28500.0);

        /*
        //Wyświetlenie utworzonych obiektów
        c0.wyswietlInfo();
        c1.wyswietlInfo();
        c2.wyswietlInfo();
        c3.wyswietlInfo();
        c4.wyswietlInfo();
        */

        //Utworznie tablicy obiektów.
        //Car[] c = new Car[7];
        Car[] c = {c0,c1,c2,c3,c4,c5,c6};

        /*
        //Inicjalizacja elementów tablicy
        c[0] = new Car("Ford","C-Max Grand",2011,202150,5,1993.0,26000.0);
        c[1] = new Car("Mazda", "MX-5",2022, 12000,3,1998.0, 150000.0);
        c[2] = new Car("Toyota","Auris", 2019, 102540,5,1798.0,87000.0);
        c[3] = new Car("Seat","Leon", 2009, 314000,5,1896.0,32000.0);
        c[4] = new Car("BMW","M3", 2002, 250678,3,2998.0, 180000.0);
        c[5] = new Car("Fiat","500",2014,250150, 3, 1242.0,31000.0);
        c[6] = new Car("Ford","Mondeo",2017,170670, 5,2967.0,28500.0);
        */
        //Wyswietlenie informacji o samochodach z tablicy za pomocą pętli for each.
        for(Car car : c){
            //System.out.println(car.marka + " " + car.model + " " + car.rokProdukcji + " " + car.przebieg);
            car.wyswietlInfo();
        }

    }
}