public class Main {

    static void main (String[] args) {

        Automobil auto1 = new Automobil("BMW", "320d", 2020, "ZG-1234-AA");

        auto1.upali();
        auto1.upali();
        auto1.ugasi();
        auto1.ugasi();
        auto1.ubrzaj(60);
        auto1.upali();
        auto1.ubrzaj(60);
        auto1.ubrzaj(7);
        auto1.uspori(30);
        auto1.ugasi();

    }
}
