//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ZaezadzanieZoo {
    public static void main(String[] args) {
        Zwierze lew = new Lew("Lew Afrykański", 3, 4);
        Zwierze pingwin = new Pingwin("Pingwin cesarski", 3, "czarno-biały");
        Zwierze wąż = new Wąż("Żmija", 1, "Żmijowate");

        Zwierze[] zwierzeta = {lew, pingwin, wąż};
        for (Zwierze zw : zwierzeta) {
            System.out.println("-----");
            System.out.println(zw);
            System.out.println("Dźwięk: " + zw.wydajDzwiek());
            System.out.println("Porusza się: " + zw.poruszajSie());
            System.out.println("Środowisko naturalne: " + zw.srodowiskoNaturalne());
        }
    }
}