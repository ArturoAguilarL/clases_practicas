import java.util.Comparator;

public class HeapSortSorterImple<T> implements Sorter<T>{
    @Override
    public void sort(T[] arr, Comparator<T> c) {
        int len = arr.length;

        for(int i = len/2 - 1; i >= 0; i--)
            heapify(arr, c, len, i);

        for(int i = len - 1; i > 0; i--){
            T tAux = arr[0];
            arr[0] = arr[i];
            arr[i] = tAux;
            heapify(arr, c, i, 0);
        }

    }

    private void heapify(T arr[], Comparator<T> c, int n, int i){
        int largest = i; //Inicializo el mas largo como raiz
        int l = 2 * i + 1; // left
        int r = 2 * i + 2; // derecha

        if(l < n && c.compare(arr[l], arr[largest]) > 0){
            largest = l;
        }
        if(r < n && c.compare(arr[r],arr[largest]) > 0){
            largest = r;
        }
        if(largest != i){
            T tAux = arr[i];
            arr[i] = arr[largest];
            arr[largest] = tAux;

            heapify(arr, c, n, largest);
        }
    }
}
