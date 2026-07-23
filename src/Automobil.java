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

    public String getMarka() {
        return this.marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getGodinaProizvodnje() {
        return this.godinaProizvodnje;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public String getRegistracija() {
        return this.registracija;
    }

    public void setRegistracija(String registracija) {
        this.registracija = registracija;
    }

    public void upali() {
        if (upaljeno) {
            System.out.println("Automobil je već upaljen.");
        } else {
            System.out.println("Automobil se pali.");
            upaljeno = true;
        }
    }

    public void ugasi() {
        if (trenutnaBrzina != 0) {
            System.out.println("Automobil se ne može ugasiti u pokretu.");
        } else if (!upaljeno) {
            System.out.println("Automobil je već ugašen.");
        } else {
            upaljeno = false;
            System.out.println("Automobil se gasi.");
        }
    }
}
