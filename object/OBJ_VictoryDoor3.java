package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_VictoryDoor3 extends SuperObject{
    GamePanel gp;
    public OBJ_VictoryDoor3(GamePanel gp) {
        name = "VictoryDoor3";

        try{
            image = ImageIO.read(getClass().getResourceAsStream("/objects/sideDoor.png"));
            uTool.scaleImage(image, gp.getTileSize(), gp.getTileSize());
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        collision = true;
    }
}
