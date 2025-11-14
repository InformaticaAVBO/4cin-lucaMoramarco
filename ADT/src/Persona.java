public class Persona {
    protected String nome;
    protected String cognome;

    public Persona( String nome, String cognome ) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String toString() {
        return nome + " " + cognome;
    }
}