public class LinearSearch {
    private final int[] data = new int[5000];

    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch();
        linearSearch.fill();
        int smallest = 0, largest = 1, result;
        double sum = 0;
        System.out.print("Searching");
        for (int i = 1; i <= 500; i++) {
            result = linearSearch.find((int) (Math.random() * 5000));
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

    private int getUnused() {
        int val = (int) (Math.random() * 5000);
        while (data[val] != 0) {
            val = (int) (Math.random() * 5000);
        }
        return val;
    }

    public void fill() {
        System.out.print("Filling");
        for (int i = 1; i <= 5000; i++) {
            data[getUnused()] = i;
            if (i % 50 == 0) {
                System.out.print(".");
            }
        }
        System.out.println();
    }

    public int find(int valToFind) {
        int num = 0;
        for (int val : data) {
            num++;
            if (val == valToFind) {
                break;
            }
        }
        return num;
    }
}
