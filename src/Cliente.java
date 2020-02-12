public class Cliente {

    private int numeroDoCliente;
    private String nomeCompleto;
    private String rg;
    private String cpf;

    public Cliente(int numeroDoCliente, String nomeCompleto, String rg, String cpf) {
        this.numeroDoCliente = numeroDoCliente;
        this.nomeCompleto = nomeCompleto;
        this.rg = rg;
        this.cpf = cpf;
    }

    public int getNumeroDoCliente() {
        return numeroDoCliente;
    }

    public void setNumeroDoCliente(int numeroDoCliente) {
        this.numeroDoCliente = numeroDoCliente;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
