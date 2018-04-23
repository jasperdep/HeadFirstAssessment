public class Main {

    public static void main(String[] args) {

        Machinist machinist = new Machinist("Peter");

        Trein trein = new Trein(machinist);

        //Goes
        TweedeKlas Shawn = new TweedeKlas("Shawn");
        TweedeKlas Thomas = new TweedeKlas("Thomas");
        TweedeKlas Jasper = new TweedeKlas("Jasper");
        TweedeKlas Andries = new TweedeKlas("Andries");
        TweedeKlas Piet = new TweedeKlas("Piet");

        EersteKlas Sjaak = new EersteKlas("Sjaak");

        Zwartrijder Jan = new Zwartrijder("Jan");

        trein.instappen(Shawn);
        trein.instappen(Thomas);
        trein.instappen(Jasper);
        trein.instappen(Andries);
        trein.instappen(Piet);
        trein.instappen(Sjaak);
        trein.instappen(Jan);

        /*Station Goes = new Station();
        Goes.komtAan(trein);*/

        //Arnemuiden
        //Nieuwe wagon
        TweedeKlas Henk = new TweedeKlas("Henk");
        TweedeKlas Klaas = new TweedeKlas("Klaas");

        trein.instappen(Henk);
        trein.instappen(Klaas);

        /*Station Arnemuiden = new Station();
        Arnemuiden.komtAan(trein);*/

        //Tussen Arnemuiden en Middelburg
        Nameable uitgestapte = trein.uitstappen("Henk");

        //Middelburg
        trein.uitstappen(" Shawn");
        trein.uitstappen(" Thomas");
        trein.uitstappen(" Jasper");
        trein.uitstappen(" Andries");
        trein.uitstappen(" Piet");
        trein.uitstappen(" Sjaak");


        /*Station Middelburg = new Station();
        Middelburg.komtAan(trein);*/

        //Vlissingen-Souburg

       /* Station VlissingenSouburg = new Station();
        VlissingenSouburg.komtAan(trein);*/

        //Vlissingen
        trein.uitstappen("Henk");

        /*Station Vlissingen = new Station();
        Vlissingen.komtAan(trein);*/

    }

}
