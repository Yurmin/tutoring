package Banca;

class ImportoMaggioreSaldoException // Dichiara una classe
extends Exception // Prende attributi e metodi da un'altra classe
{
    public ImportoMaggioreSaldoException(String message) // Costruttore
    {
        super(message); // Costruttore di Exception
    }
}