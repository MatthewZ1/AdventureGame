package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Roids extends SuperObject {
    GamePanel gp;

    public OBJ_Roids(GamePanel gp) {
        name = "Roids";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/objects/roids.png"));
            uTool.scaleImage(image, gp.getTileSize(), gp.getTileSize());
        } catch (IOException e) {
            e.printStackTrace();
        }
        collision = false;
    }
}
