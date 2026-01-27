public class Porto {

    private Barca[] posti;

    // COSTRUTTORE
    public Porto(int numeroPosti) {
        posti = new Barca[numeroPosti];
    }

    // Assegna un posto a una barca
    public int assegnaPosto(Barca barca) throws Exception {
        for (int i = 0; i < posti.length; i++) {
            int numeroPosto = i + 1;

            // Posti 1-20: max 10 metri
            if (numeroPosto <= 20 && barca.getLunghezza() > 10)
                continue;

            // Barche a vela solo dopo il posto 50
            if (barca.getTipo().equals("vela") && numeroPosto <= 50)
                continue;

            if (posti[i] == null) {
                posti[i] = barca;
                return numeroPosto;
            }
        }
        throw new Exception("Nessun posto disponibile");
    }

    // Libera posto e calcola costo
    public double liberaPosto(int numeroPosto, int giorni) throws Exception {
        if (numeroPosto < 1 || numeroPosto > posti.length)
            throw new Exception("Numero posto non valido");

        int index = numeroPosto - 1;
        Barca barca = posti[index];

        if (barca == null)
            throw new Exception("Posto già libero");

        double costo;
        if (barca.getTipo().equals("vela")) {
            costo = barca.getLunghezza() * 10 * giorni;
        } else {
            costo = barca.getStazza() * 20 * giorni;
        }

        posti[index] = null;
        return costo;
    }

    // Info barca in un posto
    public Barca infoPosto(int numeroPosto) throws Exception {
        if (numeroPosto < 1 || numeroPosto > posti.length)
            throw new Exception("Numero posto non valido");

        if (posti[numeroPosto - 1] == null)
            throw new Exception("Posto libero");

        return posti[numeroPosto - 1];
    }
}
