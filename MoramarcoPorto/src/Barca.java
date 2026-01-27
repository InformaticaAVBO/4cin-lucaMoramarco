public class Barca {

    private String nome;
    private String nazionalita;
    private double lunghezza; // metri
    private double stazza;    // tonnellate
    private String tipo;      // "vela" o "motore"

    // COSTRUTTORE
    public Barca(String nome, String nazionalita, double lunghezza, double stazza, String tipo) {
        this.nome = nome;
        this.nazionalita = nazionalita;
        this.lunghezza = lunghezza;
        this.stazza = stazza;
        this.tipo = tipo;
    }

    // GETTER
    public String getNome() {
        return nome;
    }

    public String getNazionalita() {
        return nazionalita;
    }

    public double getLunghezza() {
        return lunghezza;
    }

    public double getStazza() {
        return stazza;
    }

    public String getTipo() {
        return tipo;
    }
}
