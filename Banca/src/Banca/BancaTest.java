package Banca;

public class BancaTest {
    public static void main(String[] args){
        
        ContoCorrente cc = new ContoCorrente(5000, "u1", "p1");
        try {
            cc.prelievo(6000);
            cc.deposito(-6000);
        } catch (ImportoMaggioreSaldoException | ImportoNegativoException e) {
            System.out.println("ImportoMaggioreSaldoException!");
            e.printStackTrace();
        }

    }
}
