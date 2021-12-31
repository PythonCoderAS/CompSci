import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

    public static void insert(int[] a, int n, int x){
        for (int i = 0; i <= n; i++) {
            if (a[i] < x){
                int temp = a[i];
                a[i] = x;
                a[n] = temp;
            }
        }
    }

    public static void insertionSort(int[] arr){
        int temp;
        for (int i=1; i < arr.length; i++){
            while (arr[i-1] > arr[i]){
                temp = arr[i];
                arr[i]  = arr[i-1];
                arr[i-1] = temp;
                if (i != 1){
                    i--;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Array Dimensions: ");
        int dim = scanner.nextInt();
        int[] arr = new int[dim];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element for array index #"+i+": ");
            arr[i] = scanner.nextInt();
        }
        insertionSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

}
