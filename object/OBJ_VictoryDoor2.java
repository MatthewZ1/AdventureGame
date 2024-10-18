package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_VictoryDoor2 extends SuperObject{
    GamePanel gp;
    public OBJ_VictoryDoor2(GamePanel gp) {
        name = "VictoryDoor2";

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
