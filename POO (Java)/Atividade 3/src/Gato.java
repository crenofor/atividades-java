public class Gato extends Animal {

    public Gato(String name, int age) {
        super(name, age);
    }

    @Override
    void emitirSom() {
        System.out.println("O gato mia: Miau!");
    }

}
