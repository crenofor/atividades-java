public class Main {
    public static void main(String[] args) {
        Funcionario estagiario = new Estagiario("João", 1000);
        Funcionario programador = new Programador("Didi", 3000);
        Funcionario gerente = new Gerente("Maria", 5000);

        estagiario.calcularBonus(estagiario.getSalario());
        programador.calcularBonus(programador.getSalario());
        gerente.calcularBonus(gerente.getSalario());
    }
}