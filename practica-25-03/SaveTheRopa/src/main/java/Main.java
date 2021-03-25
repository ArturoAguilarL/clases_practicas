import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Prenda> prendasLaverrap = new ArrayList<>();

        prendasLaverrap.add(new Prenda("Travis Scott", "Astroworld"));
        prendasLaverrap.add(new Prenda("Nike", "Boca Juniors"));
        prendasLaverrap.add(new Prenda("Nike", "Remera Titular Boka"));
        prendasLaverrap.add(new Prenda("Gola", "Medias"));

        GuardaRopa laverrap = new GuardaRopa();

        int prendas = laverrap.guardarPrendas(prendasLaverrap);

        System.out.println("Numero identificador de donde fueron guardadas las prendas:" +prendas);
        laverrap.mostrarPrendas();



    }
}
