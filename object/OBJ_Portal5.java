package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;
//bottom left victoy 
public class OBJ_Portal5 extends SuperObject{
    GamePanel gp;
    public OBJ_Portal5(GamePanel gp) {
        name = "Portal5";

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
