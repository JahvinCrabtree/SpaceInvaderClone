package Classes;

import static Classes.EntityState.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Entity extends ImageView {
    
    EntityState state;

    // Pretty much just setting the state of the entity - location and status of it.

    public Entity(double x, double y, Image img) {
        this.setX(x);
        this.setY(y);
        this.state = ALIVE;
        this.setImage(img);
    }

    void moveX (double velX) {
        setX(getX()+velX); // Vel = Velocity
    }

    void moveY(double velY) {
        setY(getY()+velY); 
    }

    boolean isDead() {
        return state == DEAD;
    }


}
