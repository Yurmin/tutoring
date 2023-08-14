package BancaClient;

import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class BancaClient {

    public void start() {
        try ( 
            //  Il blocco `try-with-resources` permette di utilizzare classi
            //  che implementano le interfacce `java.lang.AutoCloseable`
            //  e `java.io.Closeable` senza aver bisongo di aprire un blocco
            //  `finally` per chiudere connessioni ecc
                
                // Apre uno scanner per leggere input, `System.in` riguarda l'input da console
                Scanner scanner = new Scanner(System.in);
                // Apre una connessione con un server ad indirizzo e porta specificati
                Socket clientSocket = new Socket(InetAddress.getLocalHost(), 50000);
                // Connette un PrintWriter per scrivere dati all'OutputStream del Socket
                PrintWriter pw = new PrintWriter(clientSocket.getOutputStream(), true);) {

            // Lettura input da utente
            // Legge una stringa dall'input stream finché non trova un line separator `\n`
            String u = scanner.nextLine();
            String p = scanner.nextLine();
            System.out.println("User: " + u + "\nPassword: " + p);

            // Invio input a server
            pw.println(u);
            pw.println(p);

        } catch (Exception e) {
            // Stampa l'eccezione se succede qualcosa
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        BancaClient client = new BancaClient();
        client.start();
    }

}
