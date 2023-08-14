package Banca;

import java.util.UUID;

/**
 * Questa classe si occupa della gestione dei conti correnti di una Banca.
 */
public class ContoCorrente {

    protected double saldo;
    protected String proprietario;
    protected String password;
    protected UUID uuid;

    public ContoCorrente(double saldo, String proprietario, String password) {
        this.saldo = saldo;
        this.proprietario = proprietario;
        this.password = password;
        this.uuid = UUID.randomUUID();
    }

    /**
     * Un'operazione per il prelievo di denaro dal saldo del conto corrente
     * 
     * @param importo Quanto denaro verrà prelevato
     * @return L'operazione relativa al prelievo
     */
    public Operazione prelievo(double importo) throws ImportoMaggioreSaldoException, ImportoNegativoException {
        if (importo > saldo) { // Se l'importo è maggiore del saldo
            throw new ImportoMaggioreSaldoException("L'importo è maggiore del saldo del conto corrente");
        } else if (importo < 0) {
            throw new ImportoNegativoException("L'importo è negativo");
        } else { // Altrimenti...
            saldo = saldo - importo; // Effettuare l'operazione
        }
        return new Operazione(TipoOperazione.PRELIEVO, uuid);
    }

    /**
     * Un'operazione per il deposito di denaro nel saldo del conto corrente
     * 
     * @param importo Quanto denaro verrà prelevato
     * @return L'operazione relativa al deposito
     */
    public Operazione deposito(double importo) throws ImportoNegativoException {
        if (importo < 0) {
            throw new ImportoNegativoException("L'importo è negativo");
        }else{
            saldo = saldo + importo;
        }
        return new Operazione(TipoOperazione.DEPOSITO, uuid);
    }

}