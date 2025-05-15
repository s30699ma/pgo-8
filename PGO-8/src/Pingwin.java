public class Pingwin extends Zwierze{
    private String kolor;

    public Pingwin(String nazwa, int wiek, String kolor){
        super(nazwa, wiek);
        this.kolor = kolor;
    }
    @Override
    public String wydajDzwiek(){
        return "AAA";
    }
    @Override
    public String poruszajSie(){
        return "Pingwiny nie latają ";
    }
    @Override
    public String srodowiskoNaturalne(){
        return "Lodowce";
    }
   public String kolor(){
        return kolor;
   }

    public String getKolor() {
        return kolor;
    }
}
