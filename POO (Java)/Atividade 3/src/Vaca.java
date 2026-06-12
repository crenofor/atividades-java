public class Vaca extends Animal {

    public Vaca(String name, int age) {
        super(name, age);
    }

    @Override
    void emitirSom() {
        System.out.println("A vaca muge: Muu!");
    }
}
