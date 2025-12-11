public class App {
    public static void main(String[] args) throws Exception {
        ListaStringhe lista = new ListaStringhe();

        
        lista.add("Luca");
        lista.add("Paolo");
        lista.add("Maria");
        lista.add("Mattia");

        System.out.println("Contenuto lista: " + lista);
        System.out.println("Dimensione: " + lista.size());

        
        System.out.println("Elemento in posizione 2: " + lista.get(2));
        String rimosso = lista.remove(1);
        System.out.println("Rimosso: " + rimosso);
        System.out.println("Lista dopo rimozione: " + lista);
        System.out.println("Dimensione ora: " + lista.size());
    }
}