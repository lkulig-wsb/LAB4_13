package MyPacakage1;
//Klasa Car.
public class Car {
    //Dane składowe klasy Car.
    private String marka;
    private String model;
    private int rokProdukcji;
    private int przebieg;
    private int liczbaDrzwi;
    private double cena;
    private double pojemnoscSilnika;
    //Konstruktor klasy Car.
    public Car (String marka, String model, int rokProdukcji, int przebieg,
                int liczbaDrzwi, double pojemnoscSilnika, double cena)
    {
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = przebieg;
        this.liczbaDrzwi = liczbaDrzwi;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.cena = cena;
    }
   //Metoda wyświetlająca informacje o samochodzie.
    public void wyswietlInfo()
    {
        System.out.println("Marka:  " + marka);
        System.out.println("Model:  " + model);
        System.out.println("Rok Produkcji:  " + rokProdukcji);
        System.out.println("Przebieg:   " + przebieg);
        System.out.println("Liczba drzwi:   " + liczbaDrzwi);
        System.out.println("Pojemność silnika:  " + pojemnoscSilnika);
        System.out.println("Cena:   " + cena + "\n");
    }
}
