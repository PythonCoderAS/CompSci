import java.util.Arrays;
import java.util.Scanner;

public class SortingAlgos {
    public static int[] randomElements(int size){
        int[] elements = new int[size];
        for (int i=0; i<size; i++){
            elements[i] = (int) (Math.random() * 1000);
        }
        return elements;
    }

    public static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j=i+1; j< arr.length; j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    public static void insertionSort(int[] arr){
        for (int i=0; i< arr.length - 1; i++){
            int j = i;
            while (j >= 0 && arr[j+1] < arr[j]){
                swap(arr, j+1, j);
                j--;
            }
        }
    }

    public static void mergeSort(int[] arr){
        mergeSort(arr, 0, arr.length-1);
    }

    public static void mergeSort(int[] arr, int from, int to){
        if (from >= to){
            return;
        }
        int mid = (from + to) / 2;
        mergeSort(arr, from, mid);
        mergeSort(arr, mid + 1, to);
        int[] temp = new int[to-from+1];
        int leftIndex = from, rightIndex=mid+1;
        for (int i=0; i<temp.length; i++){
            if (leftIndex > mid){
                temp[i] = arr[rightIndex];
                rightIndex++;
            } else if (rightIndex > to){
                temp[i] = arr[leftIndex];
                leftIndex++;
            }
            else if (arr[leftIndex] <= arr[rightIndex]){
                temp[i] = arr[leftIndex];
                leftIndex++;
            } else {
                temp[i] = arr[rightIndex];
                rightIndex++;
            }
        }
        int i = from;
        for (int item: temp){
            arr[i] = item;
            i++;
        }
    }

    public static void quickSort(int[] arr){
        quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(int[] arr, int from, int to){
        if (from >= to){
            return;
        }
        int pivot = (from + to) / 2;
        swap(arr, to, pivot);
        pivot = to;
        int leftBound = from;
        int rightBound = to - 1;
        while (rightBound>=leftBound) {
            while (leftBound <= to && leftBound <= rightBound && arr[leftBound] <= arr[pivot]) {
                leftBound++;
            }
            while (rightBound >= leftBound && rightBound >= from && arr[rightBound] >= arr[pivot]) {
                rightBound--;
            }
            if (rightBound>=leftBound){
                swap(arr, rightBound, leftBound);
            }
        }
        swap(arr, pivot, leftBound);
        pivot = leftBound;
        quickSort(arr, from, pivot-1);
        quickSort(arr, pivot+1, to);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = randomElements(10);
        System.out.println("Random array: " + Arrays.toString(arr));
        System.out.println("Sorting methods:\n1. Selection sort\n2. Insertion sort\n3. Merge sort\n4. Quicksort");
        System.out.print("Choose sorting method: ");
        switch (scanner.nextInt()){
            case 1:
                selectionSort(arr);
                break;
            case 2:
                insertionSort(arr);
                break;
            case 3:
                mergeSort(arr);
                break;
            case 4:
                quickSort(arr);
                break;
            default:
                System.out.println("Unrecognized number");
                return;
        }
        System.out.println("Final array: " + Arrays.toString(arr));
    }
}
