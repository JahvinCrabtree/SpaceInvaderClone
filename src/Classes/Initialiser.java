package Classes;


import static Utils.Images.*;
import java.util.LinkedList;
import java.util.List;

public class Initialiser {
    
    // Following body of code initialises the WALLS
    // they're what the player ducks behind when he shoots
    // Just X and Y values for placement on the screen.
    
    static List<Entity> initWalls(int x, int y) {
        List<Entity> list = new LinkedList<>();

        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 15; j++) {
                if (x == 300) {
                    x = 400;
                }
                else if (x ==600) {
                    x = 700;
                }
                list.add(new Entity(x , y, Wall));
                x += 40;
            }
            x = 100;
            y += 30;
        }
        return list;
    }
}

