import java.util.Scanner;

public class Hangman {
    private static final String wordThree = "cat";
    private static final String wordFour = "java";
    private static final String wordFive = "plant";
    private static final String wordSix = "potato";
    private static final String wordSeven = "pumpkin";
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean toPlay = true;
        System.out.println("Welcome to Hangman!");
        while (toPlay) {
            play();
            boolean toAsk = true;
            while (toAsk) {
                System.out.print("Play again? Type yes or no: ");
                switch (scanner.next().toLowerCase()) {
                    case "yes":
                        toAsk = false;
                        break;
                    case "no":
                        toAsk = false;
                        toPlay = false;
                        break;
                    default:
                        System.out.println("Invalid input. Must be yes or no.");
                        break;
                }
            }
        }
        System.out.println("Thanks for playing Hangman!");
    }

    public static String getWord() {
        int num = (int) ((Math.random() * 5) + 1);
        switch (num) {
            case 1:
                return wordThree;
            case 2:
                return wordFour;
            case 3:
                return wordFive;
            case 4:
                return wordSix;
            default:
                return wordSeven;
        }
    }

    public static String generateFiller(int length) {
        String built = "";
        for (int i = 0; i < length; i++) {
            built += "_";
        }
        return built;
    }

    public static boolean determineIfWinner(String entry) {
        return !entry.contains("_");
    }

    public static int countOfUnderscores(String entry) {
        int count = 0;
        String toCheck;
        for (int i = 0; i < entry.length(); i++) {
            if (i == entry.length() - 1) {
                toCheck = entry.substring(i);
            } else {
                toCheck = entry.substring(i, i + 1);
            }
            if (toCheck.equals("_")) {
                count++;
            }
        }
        return count;
    }

    public static String randomHint(String word, String entry) {
        int count = countOfUnderscores(entry);
        int randomNumber = (int) (Math.random() * count) + 1;
        String toCheck;
        int num = 0;
        for (int i = 0; i < entry.length(); i++) {
            if (i == entry.length() - 1) {
                toCheck = entry.substring(i);
            } else {
                toCheck = entry.substring(i, i + 1);
            }
            if (toCheck.equals("_")) {
                num++;
                if (num == randomNumber) {
                    return String.valueOf(word.charAt(i));
                }
            }
        }
        return ""; // this will never happen but Java compiler was adamant
    }

    public static String playLetter(String word, String entry, String letter) {
        if (!word.contains(letter) || entry.contains(letter)) {
            return entry;
        }
        String newString = "";
        String toCheck;
        for (int i = 0; i < word.length(); i++) {
            if (i == word.length() - 1) {
                toCheck = word.substring(i);
            } else {
                toCheck = word.substring(i, i + 1);
            }
            if (toCheck.equals(letter)) {
                newString += letter;
            } else {
                if (i == word.length() - 1) {
                    newString += entry.substring(i);
                } else {
                    newString += entry.substring(i, i + 1);
                }
            }
        }
        return newString;
    }

    public static String displayBoard(String entry) {
        String newString = "";
        for (int i = 0; i < entry.length(); i++) {
            if (i == entry.length() - 1) {
                newString += entry.substring(i);
            } else {
                newString += entry.substring(i, i + 1) + " ";
            }
        }
        return newString;
    }

    public static void play() {
        String word = getWord();
        String fill = generateFiller(word.length());
        String oldFill;
        int tries = word.length() - 1;
        boolean toBreak = false;
        while (!toBreak) {
            System.out.println("Current Hangman status: " + displayBoard(fill));
            if (determineIfWinner(fill)) {
                System.out.println("You win! Tries remaining: " + tries + ".");
                toBreak = true;
            } else if (tries == 0) {
                System.out.println("You lose! The word was " + word + ". Characters remaining: " + countOfUnderscores(fill));
                toBreak = true;
            } else {
                System.out.print("Enter a letter: ");
                String letter = scanner.next();
                oldFill = fill;
                fill = playLetter(word, fill, letter);
                if (fill.equals(oldFill)) {
                    tries--;
                    System.out.println("Wrong! Tries remaining: " + tries + ". Hint: Play the letter " + randomHint(word, fill));
                } else {
                    System.out.println("Correct!");
                }
            }
        }
    }
}
