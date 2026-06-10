public class Estagiario extends Funcionario{
    public Estagiario(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    void calcularBonus(double salario) {
        double bonus = salario * 0.05;
        System.out.println("O bônus do estagiário " + getNome() + " é: " + bonus);
        System.out.println("Salario total " + (salario + bonus));
    }
}
