public class Main {

    static void main (String[] args) {

        Automobil auto1 = new Automobil("BMW", "320d", 2020, "ZG-1234-AA");

        auto1.upali();
        auto1.upali();
        auto1.ugasi();
        auto1.ugasi();
        auto1.upali();
        auto1.ubrzaj(60);
        System.out.println(auto1.isUpaljeno());
        System.out.println(auto1.getTrenutnaBrzina());

    }
}
