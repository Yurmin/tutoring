package Banca;

import java.time.Instant;
import java.util.UUID;

/**
 * La classe Operazione gestisce le operazioni come saranno viste e autenticate dalla banca.
 */
public class Operazione {
    
    protected TipoOperazione tipo;
    protected UUID proprietario;
    protected Instant time;

    public Operazione(TipoOperazione tipo, UUID proprietario) {
        this.tipo = tipo;
        this.proprietario = proprietario;
        this.time = Instant.now();
    }
    
}
