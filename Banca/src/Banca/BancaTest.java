package Banca;

public class BancaTest {
    public static void main(String[] args) {

        ContoCorrente cc = new ContoCorrente(5000, "u1", "p1");
        try {
            cc.prelievo(6000);
        } catch (ImportoMaggioreSaldoException e) {
            e.printStackTrace();
        } catch (ImportoNegativoException e) {
            e.printStackTrace();
        }
        try {
            cc.deposito(-6000);
        } catch (ImportoNegativoException e) {
            e.printStackTrace();
        }

    }
}
