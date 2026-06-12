import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro("Rex", 5));
        animais.add(new Gato("Mia", 3));
        animais.add(new Vaca("Bela", 7));

        for (Animal animal : animais) {
            System.out.println("Nome: " + animal.getName() + "\nIdade: " + animal.getAge());
            animal.emitirSom();
            System.out.println();
        }
    }
}
