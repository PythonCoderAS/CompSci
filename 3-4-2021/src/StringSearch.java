import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringSearch {
    public static void sortStrings(ArrayList<String> stringArrayList){
        String temp;
        for (int i = 0; i < stringArrayList.size() - 1; i++) {
            int smallestIndex = i;
            String smallest = stringArrayList.get(smallestIndex);
            for (int j = i+1; j < stringArrayList.size(); j++) {
                if (smallest.compareTo(stringArrayList.get(j)) > 0){
                    smallest = stringArrayList.get(j);
                    smallestIndex = j;
                }
            }
            if (smallestIndex != i){
                temp = stringArrayList.get(i);
                stringArrayList.set(i, smallest);
                stringArrayList.set(smallestIndex, temp);
            }
        }
    }

    public static int binarySearch(ArrayList<String> elements, String searchTerm){
        return binarySearch(elements, searchTerm, 0, elements.size());
    }

    public static int binarySearch(ArrayList<String> elements, String searchTerm, int start, int end){
        int indexToCheck = (end - start) / 2 + start;
        String item = elements.get(indexToCheck);
        if (item.equals(searchTerm)){
            return indexToCheck;
        } else if (end-start == 1) {
            return -1;
        } else {
            int compareToValue = item.compareToIgnoreCase(searchTerm);
            if (compareToValue > 0){ // searchTerm is in the left array
                return binarySearch(elements, searchTerm, start, indexToCheck);
            } else {
                return binarySearch(elements, searchTerm, indexToCheck, end);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File file = new File("src/Aoyan Sarkar - p022_names.txt");
        try {
            Scanner fileScanner = new Scanner(file);
            String itemString = fileScanner.nextLine();
            ArrayList<String> items = new ArrayList<String>(Arrays.asList(itemString.replace("\"", "").split(",")));
            sortStrings(items);
            System.out.print("Enter the name you want to find: ");
            String input = scanner.next();
            System.out.println("Index where the word is located: " + binarySearch(items, input));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
