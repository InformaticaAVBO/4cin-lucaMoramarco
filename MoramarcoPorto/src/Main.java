public class Main {

    public static void main(String[] args) {

        try {
            Porto porto = new Porto(100);

            Barca barca1 = new Barca(
                    "Stella",
                    "Italia",
                    9,
                    4,
                    "vela"
            );

            int posto = porto.assegnaPosto(barca1);
            System.out.println("Posto assegnato: " + posto);

            Barca info = porto.infoPosto(posto);
            System.out.println("Barca: " + info.getNome() + " - " + info.getNazionalita());

            double costo = porto.liberaPosto(posto, 3);
            System.out.println("Costo totale: " + costo + " €");

        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}

