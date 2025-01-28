// This class represents the main menu of the game. It provides options to start a new game, 
// resume a current game, view high scores, or quit the program. The menu is displayed 
// using a typewriter effect for better user experience.
package ui;

// external resources
import java.util.Scanner;

// internal resources
import main.GameLoop;
import util.TypeWriter;
import data.HighScore;
import data.Grid;

public class Menu {
    // Create connection to methods in other packages
    private final HighScore highScore = HighScore.getInstance();
    private final TypeWriter print = new TypeWriter();

    @SuppressWarnings("resource")
    public Menu() {
        public int menu() {
            print.SlowType("\nMENU");
            print.SlowType("_____________________________\n");
            print.SlowType("1. Start new game");
            print.SlowType("2. Resume current game");
            print.SlowType("3. See high scores");
            print.SlowType("4. Quit Program\n");

            Scanner scanner = new Scanner(System.in);
            print.SlowType("Enter your choice: \n");
            int input = scanner.nextInt();

            switch (input) {
                case 1: // New Game
                    print.SlowType("Starting game...\n");
                    return 1;
                case 2: // Resume Current Game
                    print.SlowType("Resuming current game...\n");
                    return 2;
                case 3: // See High Score
                    print.SlowType("Displaying high scores...\n");
                    highScore.display();
                    return 3;
                case 4: // Quit Program
                    print.SlowType("Thanks for playing the Snake game! Goodbye!\n");
                    System.exit(0);
                    return 4;
                default:
                    print.SlowType("Invalid choice. Please try again.\n");
                    // Optionally, you can loop back to the menu
                    new Menu();
                    return 0;
            }
        }
        
        print.SlowType("\nMENU");
        print.SlowType("_____________________________\n");
        print.SlowType("1. Start new game");
        print.SlowType("2. Resume current game");
        print.SlowType("3. See high scores");
        print.SlowType("4. Quit Program\n");

        Scanner scanner = new Scanner(System.in);
        print.SlowType("Enter your choice: \n");
        int input = scanner.nextInt();

        switch (input) {
            case 1: // New Game
                print.SlowType("Starting game...\n");
                return 1;
            case 2: // Resume Current Game
                print.SlowType("Resuming current game...\n");
                return 2;
            case 3: // See High Score
                print.SlowType("Displaying high scores...\n");
                highScore.display();
                return 3;
            case 4: // Quit Program
                print.SlowType("Thanks for playing the Snake game! Goodbye!\n");
                System.exit(0);
                return 4;
            default:
                print.SlowType("Invalid choice. Please try again.\n");
                // Optionally, you can loop back to the menu
                new Menu();
                return 0;
        }
    }
}