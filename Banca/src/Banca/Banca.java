package Banca;

public class Banca {

    public ContoCorrente login(String proprietario, String password) {
        // TODO
        return new ContoCorrente(0, proprietario, password);
    }

    public ContoCorrente logout(String proprietario, String password) {
        // TODO
        return new ContoCorrente(0, proprietario, password);
    }

    public Operazione accredito(ContoCorrente mittente, ContoCorrente destinatario) {
        // TODO
        return new Operazione(null, null);
    }

}
