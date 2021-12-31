import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Rock Paper Scissors!");
        System.out.print("Play a move. 'r' for rock, 'p' for paper, and 's' for scissors: ");
        switch (scanner.next().toLowerCase()){
            case "r":
                System.out.println("You chose: Rock.");
                doComputer(1);
                break;
            case "p":
                System.out.println("You chose: Paper.");
                doComputer(2);
                break;
            case "s":
                System.out.println("You chose: Scissors.");
                doComputer(3);
                break;
            default:
                System.out.println("Your choice did not match any of the valid choices. Play 'r' for rock, 'p' for paper, and 's' for scissors.");
                break;
        }
    }

    public static void doComputer(int move){
        int computerMove = (int) ((Math.random() * 3) + 1);
        switch (computerMove){
            case 1:
                System.out.println("Computer chose: Rock.");
                break;
            case 2:
                System.out.println("Computer chose: Paper.");
                break;
            case 3:
                System.out.println("Computer chose: Scissors.");
                break;
        }
        switch (computerMove){
            case 1:
                switch (move){
                    case 1:
                        System.out.println("Draw! Rock draws with Rock.");
                        break;
                    case 2:
                        System.out.println("You win! Paper beats Rock!");
                        break;
                    case 3:
                        System.out.println("You lose! Rock beats Scissors!");
                        break;
                }
                break;
            case 2:
                switch (move){
                    case 1:
                        System.out.println("You lose! Paper beats Rock!");
                        break;
                    case 2:
                        System.out.println("Draw! Paper draws with Paper.");
                        break;
                    case 3:
                        System.out.println("You win! Scissors beats Paper!");
                        break;
                }
                break;
            case 3:
                switch (move){
                    case 1:
                        System.out.println("You win! Rock beats Scissors!");
                        break;
                    case 2:
                        System.out.println("You lose! Scissors beats Paper!");
                        break;
                    case 3:
                        System.out.println("Draw! Scissors draws with Scissors.");
                        break;
                }
                break;
        }
    }
}
