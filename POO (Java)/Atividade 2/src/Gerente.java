public class Gerente extends Funcionario{
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    void calcularBonus(double salario) {
        double bonus = salario * 0.20;
        System.out.println("O bônus do gerente " + getNome() + " é: " + bonus);
        System.out.println("Salario  " + (salario + bonus));
    }
}
