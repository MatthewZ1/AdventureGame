package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Portal3 extends SuperObject{
    GamePanel gp;
    public OBJ_Portal3(GamePanel gp) {
        name = "Portal3";

        try{
            image = ImageIO.read(getClass().getResourceAsStream("/objects/portal.png"));
            uTool.scaleImage(image, gp.getTileSize(), gp.getTileSize());
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        collision = true;
    }
}