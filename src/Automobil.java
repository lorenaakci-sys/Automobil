public class Automobil {

    private String marka;
    private String model;
    private int godinaProizvodnje;
    private String registracija;
    private int trenutnaBrzina;
    private boolean upaljeno;

    public Automobil(String marka, String model, int godinaProizvodnje, String registracija) {
        this.marka = marka;
        this.model = model;
        this.godinaProizvodnje = godinaProizvodnje;
        this.registracija = registracija;
        this.trenutnaBrzina = 0;
        this.upaljeno = false;
    }
}
