package MyPacakage1;

public class Car {
    public String marka;
    public String model;
    public int rokProdukcji;
    public int przebieg;
    public int liczbaDrzwi;
    public double cena;
    public double pojemnoscSilnika;

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
