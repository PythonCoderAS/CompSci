import java.util.Scanner;

public class vowelCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();
        System.out.println("Vowels in the input: " + countVowels(input));
    }

    public static int countVowels(String str){
        int count =0;
        str = str.toLowerCase();
        String current = "";
        for (int i=0; i < str.length(); i++){
            if (i == (str.length() - 1)){
                current = str.substring(i);
            } else {
                current = str.substring(i, i+1);
            }
            if (current.equals("a") || current.equals("e") || current.equals("i") || current.equals("o") || current.equals("u")){
                count++;
            }
        }
        return count;
    }
}
