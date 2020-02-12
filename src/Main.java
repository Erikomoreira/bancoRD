public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente(123, "Erik de Oliveira", "30000000", "12312309809");


        System.out.println(" ---- CONTA CORRENTE ------");

        Cheque cheque = new Cheque(100, "Bradesco", "12/12/2019");
        ContaCorrente contaCorrente = new ContaCorrente(0,1000, cliente);
        contaCorrente.depositar(100);
        contaCorrente.consultar();
        contaCorrente.sacar(200);
        contaCorrente.consultar();
        contaCorrente.depositarCheque(cheque);
        contaCorrente.consultar();


        System.out.println(" ---- CONTA POUPANÇA ------");

        ContaPoupanca contaPouanca = new ContaPoupanca(0,0.6, cliente);
        contaPouanca.depositar(100);
        contaPouanca.recolherJuros();
        contaPouanca.consultar();
        contaPouanca.sacar(100);
        contaPouanca.consultar();


    }
}
