package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Portal6 extends SuperObject{
    GamePanel gp;
    public OBJ_Portal6(GamePanel gp) {
        name = "Portal6";

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
