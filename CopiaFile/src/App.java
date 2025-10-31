import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;

public class App {

    public static void copyFile(String fileIn, String fileOut) throws Exception{
        File f = new File(fileIn);
        Scanner leggi = new Scanner(f);
        FileWriter scrivi = new FileWriter(fileOut);
        while( leggi.hasNextLine()) {
            String s = leggi.nextLine();
            scrivi.write(s + "\n");
        }
        scrivi.close();
        leggi.close();


    }
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("inserisci il nome del file input: ");
        String nomeSorgente = scanner.nextLine();
        System.out.println("inserisci il nome del file output: ");
        String nomeDestinazione = scanner.nextLine();

        scanner.close();

        System.out.println("Fine della copia di " + nomeSorgente + " in " + nomeDestinazione);

        App.copyFile(nomeSorgente, nomeDestinazione);
    }
}
