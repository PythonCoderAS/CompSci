public class BinarySearch {
    private final int[] data = new int[5000];

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        binarySearch.fill();
        int smallest = 0, largest = 1, result;
        double sum = 0;
        System.out.print("Searching");
        for (int i = 1; i <= 500; i++) {
            result = binarySearch.find((int) (Math.random() * 5000));
            if (result < smallest || smallest == 0) {
                smallest = result;
            }
            if (result > largest) {
                largest = result;
            }
            sum += result;
            if (i % 10 == 0) {
                System.out.print(".");
            }
        }
        System.out.println();
        System.out.println("Average number of searches: " + sum / 500);
        System.out.println("Smallest number of searches: " + smallest);
        System.out.println("Largest number of searches: " + largest);
    }

    public void fill() {
        System.out.print("Filling");
        for (int i = 0; i < 5000; i++) {
            data[i] = i + 1;
            if (i % 50 == 0) {
                System.out.print(".");
            }
        }
        System.out.println();
    }
    public int find(int valToFind) {
        return find(valToFind, 0, data.length);
    }

    public int find(int valToFind, int start, int end){
        int index = ((end - start) / 2) + start;
        int val = data[index];
        if (val == valToFind){
            return 1;
        } else if (val < valToFind){
            return 1 + find(valToFind, index, end);
        } else {
            return 1 + find(valToFind, start, index);
        }
    }
}
