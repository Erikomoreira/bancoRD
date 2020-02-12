public class ContaCorrente implements Conta {

    private double saldo;
    private double chequeEspecial;
    private Cliente cliente;


    public ContaCorrente(double saldo, double chequeEspecial, Cliente cliente) {
        this.saldo = saldo;
        this.chequeEspecial = chequeEspecial;
        this.cliente = cliente;
    }



    @Override
    public void depositar(double valor) {

        if (valor > 0){

            this.saldo += valor;

            System.out.println("Depósito realizado com sucesso");

        }else{
            System.out.println("O valor informado não pode ser depositado");
        }

    }

    public void depositarCheque(Cheque cheque) {

        if (cheque.getValor() > 0){

            this.saldo += cheque.getValor();

            System.out.println("Depósito de cheque realizado com sucesso");

        }else{
            System.out.println("O valor informado não pode ser depositado");
        }



    }

    @Override
    public void sacar(double valor) {

        if(this.saldo >= valor){

            this.saldo -= saldo;

            System.out.println("Saque realizado com sucesso " + " Conta: "
                    + this.saldo + " Cheque Especial " + this.chequeEspecial + " Saldo Atual: " + (this.saldo + this.chequeEspecial));

        }else if(this.chequeEspecial >= valor ){

            this.chequeEspecial -= valor;

            System.out.println("Saque realizado com sucesso  " + " Conta: "
                    + this.saldo + " Cheque Especial " + this.chequeEspecial + " Saldo Atual: " + (this.saldo + this.chequeEspecial));
        }else{

            System.out.println("Saldo insuficiente");
        }

    }

    @Override
    public void consultar() {

        System.out.println("SALDO : " + " Conta: "
                + this.saldo + " Cheque Especial " + this.chequeEspecial + " Saldo Atual: " + (this.saldo + this.chequeEspecial));

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
