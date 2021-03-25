import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRopa {
    Map<Integer, List<Prenda>> map = new HashMap<>();
    Integer index = 0;

    /* Recibe una lista de prendas y devuelve el numero identificador en donde quedaron
        asignadas las prendas, la clade del diccionario donde guardamos las prendas.
     */
    public Integer guardarPrendas(List<Prenda> listaDePrenda) {
        map.put(index, listaDePrenda);
        int id = getId();
        return id;
    }


    private int getId(){
        int id = index;
        this.index++;
        return id;
    }

    public void mostrarPrendas(){
        map.keySet().forEach(k -> System.out.println("Numero:" +k + ",Prendas:" + map.get(k)));
    }

    /*
        Devuelve la lista de prendas que estan guardadas bajo ese numero
     */
    public List<Prenda> devolverPrendas(Integer numero){
        //ToDo: verificar si el numero existe en el map, sino lanzar excepcion
        return map.remove(numero);
    }
}
