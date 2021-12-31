import java.util.Arrays;

public class QuickSort {
    private static void swap(double[] arr, int indexFrom, int indexTo) {
        double temp = arr[indexFrom];
        arr[indexFrom] = arr[indexTo];
        arr[indexTo] = temp;
    }

    private static void recursiveSort(double[] a, int from, int to) {
        if (from >= to)
            return;

        int p = (from + to) / 2;
// Partition:
        int i = from;
        int j = to;

        while (i <= j) {
            if (a[i] <= a[p])
                i++;
            else if (a[j] >= a[p])
                j--;
            else {
                swap(a, i, j);
                i++;
                j--;
            }
        }
        // Place the pivot in its correct position:
        System.out.println(i + "; " + j);
        System.out.println(Arrays.toString(a) + "; " + a[j] + "; " + a[i] + "; " + a[p]);
        if (a[i] < a[p]) {
            swap(a, p, i);
            p = i;
        } else if (a[j] > a[p]) {
            swap(a, p, j);
            p = j;
        }

        // Sort recursively:
        recursiveSort(a, from, p - 1);
        recursiveSort(a, p + 1, to);
    }

    public static void main(String[] args) {
        double[] arr = {12, 324, 54, 43, 76, 23, 45};
        recursiveSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
