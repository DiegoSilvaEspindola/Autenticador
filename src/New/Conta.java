package New;

public class Conta implements Test {
    private int id;
    private double saldo;
    private String banco;
    private String nome;

    public Conta(int id, double saldo, String banco, String nome) {
        this.id = id;
        this.saldo = saldo;
        this.banco = banco;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "id=" + id +
                ", saldo=" + saldo +
                ", banco='" + banco + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }

    @Override
    public boolean autenticaNome(String nome) {
        if (this.nome != nome) {
            System.out.println("Nome não confere");
            return false;
        } else {
            System.out.println("Nome autenticado");
            return true;
        }
    }
}
