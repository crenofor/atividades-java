public class Funcionario {
    private final String nome;
    private final double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    void calcularBonus(double salario) {
        double bonus = salario * 0.10;
        System.out.println("O bônus do funcionário " + getNome() + " é: " + bonus);
        System.out.println("Salario total" + (salario + bonus));
    }
}
