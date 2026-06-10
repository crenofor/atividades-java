public class Programador extends Funcionario {

    public Programador(String nome, double salario){
        super(nome, salario);
    }

    @Override
    void calcularBonus(double salario){
        double bonus = salario * 0.10;
        System.out.println("O bônus do programador " + getNome() + " é: " + bonus);
        System.out.println("Salario total " + (salario + bonus));
    }
}
