public class ContaPoupanca implements Conta {

    private double saldo;
    private double juros;
    private Cliente cliente;


    public ContaPoupanca(double saldo, double juros, Cliente cliente) {
        this.saldo = saldo;
        this.juros = juros;
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

    @Override
    public void sacar(double valor) {

        if(this.saldo >= valor){

            this.saldo -= valor;

        }else{

            System.out.println("Saldo insuficiente");

        }

    }

    @Override
    public void consultar() {

        System.out.println("O saldo atual é : " + this.saldo);

    }

    public void recolherJuros(){

        double saldoConta = this.saldo + (juros * this.saldo);

        this.saldo = saldoConta;

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}

