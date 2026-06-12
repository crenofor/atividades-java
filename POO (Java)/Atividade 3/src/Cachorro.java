public class Cachorro extends Animal {

    public Cachorro(String name, int age, String breed) {
        super(name, age);
    }

    @Override
    void emitirSom() {
        System.out.println("O cachorro late: Au Au!");
    }
}
