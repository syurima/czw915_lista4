public class Main {
    public static void main(String[] args) {
        Budynek[] osiedle = new Budynek[3];
        Osoba JN = new Osoba("Jan", "Nowak");
        Osoba AT = new Osoba("Andrzej", "Tabakow");

        //testy mieszkalny
        osiedle[0] = new Dom( "czerwony", 3);
        FirmaBudowlana.paint(osiedle[0], "niebieski");
        FirmaBudowlana.budujPietro(osiedle[0]);
        osiedle[0].setOwner(AT);
        osiedle[0].join(AT);
        osiedle[0].join(JN);
        //FirmaBudowlana.odnow(D1);
        osiedle[0].getStan();
        System.out.println("---");

        //testy biurowiec
        Firma F1 = new Firma("ecorp", JN);

        osiedle[1]  = new Biurowiec("zielony", 13, F1);
        osiedle[1].getStan();
        System.out.println(FirmaBudowlana.wycen(osiedle[1]));
        System.out.println("---");

        FirmaBudowlana.paint(osiedle[1], "biały");
        FirmaBudowlana.odnow(osiedle[1]);
        osiedle[1].abandon();
        osiedle[1].join(JN);
        osiedle[1].getStan();

        System.out.println(FirmaBudowlana.wycen(osiedle[1]));
        System.out.println("---");

        osiedle[2] = new Biurowiec();
        //osiedle[2].getStan();

    }
}