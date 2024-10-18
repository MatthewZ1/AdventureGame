package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_SpeedPotion extends SuperObject {
    GamePanel gp;

    public OBJ_SpeedPotion(GamePanel gp) {
        name = "Speed Potion";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/objects/speedPotion.png"));
            uTool.scaleImage(image, gp.getTileSize(), gp.getTileSize());
        } catch (IOException e) {
            e.printStackTrace();
        }
        collision = false;
    }
}
