import java.util.Comparator;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int limit = 20;

        Integer[] a = new Integer[limit];

        Random rand = new Random();
        System.out.println("hola que pasa");
        for(int i = 0; i < limit; i++){
            a[i] = rand.nextInt(limit);
        }

        HeapSortSorterImple sorter = new HeapSortSorterImple();
        Comparator<Integer> ci = (x,y) -> {
            return x - y;
        };
        sorter.sort(a,ci);

        for(int i = 0; i < limit; i++){
            System.out.println(a[i]);
        }

    }
}
