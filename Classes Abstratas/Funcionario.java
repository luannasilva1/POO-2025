public abstract class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        setNome(nome);
        setSalario(salario);
    }
    public String getNome() {
        return nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract void aumentaSalario();
        
}