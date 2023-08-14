package BancaServer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;

public class BancaServer {

    public void start() {
        try (
            // Fa si il computer "ascolti" ad una porta, in attesa di una connessione
            ServerSocket serverSocket = new ServerSocket(50000);
            ) {
            while (true) {
                // Accetta una connessione, aprendo effettivamente la possibilità di usare Input/Output Streams
                Socket socket = serverSocket.accept();
                // Connette all'InputStream della connessione un InputStreamReader per leggere dati 
                // e quest'ultimo ad un BufferedReader per leggere dati in modo organizzato
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                System.out.println("---- Opening connection ----");

                // Legge una stringa dall'InputStreamReader fino a quando non legge `\n`
                String u = in.readLine();
                String p = in.readLine();
                System.out.println("User: " + u + "\nPassword: " + p);

                System.out.println("---- Closing connection ----");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        BancaServer server = new BancaServer();
        server.start();
    }

}
