package Classes;

import static Classes.EntityState.*;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Player extends ImageView{
    EntityState state;
    
    public Player(double x, double y, Image img) {
        this.state = ALIVE;
        setX(x);
        setY(y);
        setImage(img);
    }
}
