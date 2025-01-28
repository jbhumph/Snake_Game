// This will handle the console display and all user input. This may
// split into multiple parts when we develop the GUI
package ui;

// external resources
import java.util.Scanner;
import data.*;

// internal resources

public class GameControlInput {
    // I'm not sure that we can use arrow input in the console so
    // we may need to use A (left turn), W (forward), D (right turn)
    private static final Scanner scanner = new Scanner(System.in);


    public static boolean next(Snake snake, Grid grid) {
        int x = snake.getHead().getRow();
        int y = snake.getHead().getCol();
        System.out.print("Enter your choice: ");
        System.out.println(x + " " + y);
        char input = scanner.next().charAt(0);
        boolean session = true;


        switch (input) {
            case 'a': // move left
                if (y == 0) {
                    session = snake.move(grid.getCell(x, 9), grid);
                } else {
                    session = snake.move(grid.getCell(x, y - 1), grid);
                }
                break;

            case 's': // move down
                if (x == 9) {
                    session = snake.move(grid.getCell(0, y), grid);
                } else {
                    session = snake.move(grid.getCell(x + 1, y), grid);
                }
                break;
            case 'w': // move up
                if (x == 0) {
                    session = snake.move(grid.getCell(9, y), grid);
                } else {
                    session = snake.move(grid.getCell(x - 1, y), grid);
                }
                break;    
            case 'd': // move right
                if (y == 9) {
                    session = snake.move(grid.getCell(x, 0), grid);
                } else {
                    session = snake.move(grid.getCell(x, y + 1), grid);
                }
                break;    
            case 'p': // pause and return to menu
                new Menu();
                break;

            default:
                break;
        }

        //scanner.close();
        return session;
    }
}
