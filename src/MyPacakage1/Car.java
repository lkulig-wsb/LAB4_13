package MyPacakage1;

public class Car {
    public String marka;
    public String model;
    public int rokProdukcji;
    public int przebieg;

    public Car (String marka, String model, int rokProdukcji, int przebieg)
    {
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = przebieg;
    }
    public void wyswietlInfo()
    {
        System.out.println("Marka:  " + marka);
        System.out.println("Model:  " + model);
        System.out.println("Rok Produkcji: " + rokProdukcji);
        System.out.println("Przebieg:   " + przebieg + "\n");
    }
}
