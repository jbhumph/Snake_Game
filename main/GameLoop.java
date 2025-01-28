// This will control the flow of the game
// We can start with turn based and change it to time based later
package main;

import data.*;


public class GameLoop {
    // Create connection to methods in other packages
    GameDisplay display = new ui.GameDisplay();
    GameControlInput input = new ui.GameControlInput();
    boolean session = true;

    public GameLoop() {
        Grid grid = new Grid(10, 10);
        Snake snake = new Snake(grid.getCell(5, 5));

    }

    public void start() {

    }

    public void pause() {
        new Menu();
    }

}
