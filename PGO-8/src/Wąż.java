public class Wąż extends Zwierze {
    private String rodzina;

    public Wąż(String nazwa, int wiek, String rodzina) {
        super(nazwa, wiek);
        this.rodzina = rodzina;
    }
    @Override
    public String wydajDzwiek(){
        return "SSS";
    }
    @Override
    public  String poruszajSie(){
        return "Węże poruszają się na brzuchu";
    }
    @Override
    public String srodowiskoNaturalne(){
        return "Dżungla";
    }
    public String rodzina() {
        return rodzina;
    }

    public String getRodzina() {
        return rodzina;
    }
}
