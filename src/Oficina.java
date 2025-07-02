import java.util.ArrayList;
import java.util.Collections;

public class Oficina {
    private ArrayList<Animal> animales;

    public Oficina() {
        animales = new ArrayList<>();
    }

    public void agregar(Animal a) {
        animales.add(a);
        Collections.sort(animales, new ComparadorEnergia());
    }
}
