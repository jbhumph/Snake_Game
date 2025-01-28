// This is the main entry point of the program. It initializes the game by displaying a 
// welcome message and then calling the Menu class to present the main menu options to the user.

package main;

import util.TypeWriter;
import data.*;
import ui.GameControlInput;

public class Main {
    public static void main(String[] args) {
        TypeWriter print = new TypeWriter();
        print.SlowType("\nWelcome to Snake! The best video game in the world!\n");

        Grid grid = new Grid(10, 10);
        Snake snake = new Snake(grid.getCell(5, 5));
        grid.setCellFill();
        print(grid);

        boolean session = true;
        
        while (session) {
            session = GameControlInput.next(snake, grid);
            print(grid);
        }
    }

    public static void print(Grid grid) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                switch(grid.getCellFill(i, j)) {
                    case "empty":
                        System.out.print(". ");
                        break;
                    case "food":
                        System.out.print("* ");
                        break;
                    case "snake":
                        System.out.print("O ");
                        break;
                }
            }
            System.out.println("");
        }
        System.out.println("\n");
    }
}