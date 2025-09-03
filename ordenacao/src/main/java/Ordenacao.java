
import java.util.Arrays;

public class Ordenacao {
    public static void selectionSort(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[i]) {
                    int min = v[i];
                    v[i] = v[j];
                    v[j] = min;
                }
            }
        }
        System.out.println(Arrays.toString(v));
    }

    public static void selectionSortOtimizado(int[] v) {
        int min_index = 0;
        for (int i = 0; i < v.length - 1; i++) {
            min_index = i;
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[min_index]) {
                    min_index = j;
                }
            }
            int x = v[i];
            v[i] = v[min_index];
            v[min_index] = x;
        }
        System.out.println(Arrays.toString(v));
    }

    public static void bubbleSort(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = 1; j < v.length - i; j++) {
                if (v[j - 1] > v[j]) {
                    int x = v[j];
                    v[j] = v[j - 1];
                    v[j - 1] = x;
                }
            }
        }
        System.out.println(Arrays.toString(v));
    }

    public static int binarySearch(int[] v, int x) {
        int inicio = 0;
        int fim = v.length - 1;
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (x == v[meio]) {
                return meio;
            } else {
                if (x > v[meio]) {
                    inicio = meio + 1;
                } else {
                    fim = meio - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {4, 2, 1, 3, 34, 65, 12};
        int[] a2 = {4, 2, 1, 3, 34, 65, 12};
        int[] a3 = {4, 2, 1, 3, 34, 65, 12};
        int[] a4 = {4, 2, 1, 3, 34, 65, 12};
        int x = 3;

        System.out.println("Selection Sort: ");
        selectionSort(a);
        System.out.println("Otimizado: ");
        selectionSortOtimizado(a2);
        System.out.println("Bubble: ");
        bubbleSort(a3);
        System.out.println("Binary search: ");
        if(binarySearch(a4, x) != -1){
            System.out.println("Achou o: " + x);
        } else {
            System.out.println("Não achou o: " + x);
        }

    }
}