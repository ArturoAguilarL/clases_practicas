import java.util.Comparator;

public class QuickSortSorterImple<T> implements Sorter<T>{
    @Override
    public void sort(T[] arr, Comparator<T> c) {
        int izq = 0;
        int der = arr.length - 1;

        quicksort(arr, c, izq, der);
    }


    private void quicksort(T[] arr, Comparator<T> c, int izq, int der){
        T pivote=arr[izq]; //pivot - primer elemento
        int i=izq;         // i realiza la búsqueda de izquierda a derecha
        int j=der;         // j realiza la búsqueda de derecha a izquierda
        T aux;

        while(i < j){
            while(c.compare(arr[i], pivote) <= 0  && i < j) i++;
            while(c.compare(arr[j], pivote) > 0) j--;
            if (i < j) {
                aux= arr[i];
                arr[i]=arr[j];
                arr[j]=aux;
            }
        }

        arr[izq]=arr[j];
        arr[j]=pivote;

        if(izq < j-1)
            quicksort(arr,c,izq,j-1);
        if(j+1 < der)
            quicksort(arr,c,j+1,der);
    }
}

