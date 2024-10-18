package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Puddle extends SuperObject{
    GamePanel gp;
    public OBJ_Puddle(GamePanel gp){
        name = "Puddle";
        try{
            image = ImageIO.read(getClass().getResourceAsStream("/objects/puddle.png"));
            uTool.scaleImage(image, gp.getTileSize(), gp.getTileSize());
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        collision = false;
    }
}
