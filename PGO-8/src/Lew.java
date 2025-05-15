public class Lew extends Zwierze {
    private int nogi;

    public Lew(String nazwa, int wiek, int nogi) {
        super(nazwa, wiek);
        this.nogi = nogi;
    }
    @Override
    public String wydajDzwiek(){
        return "ROAR";
    }
    @Override
    public String poruszajSie(){
        return "Lew porusza się na nogach";
    }
    @Override
    public String srodowiskoNaturalne(){
        return "Sawanna";
    }
    public int nogi() {
        return nogi;
    }

    public int getNogi() {
        return nogi;
    }
}
