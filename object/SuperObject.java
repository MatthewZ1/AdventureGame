package object;

import java.awt.image.BufferedImage;
import java.awt.*;
import main.GamePanel;
import main.UtilityTool;

// parent class of all objects in the game
public class SuperObject {
    public BufferedImage image, image2, image3;
    public String name;
    public boolean collision = false;
    public int worldX, worldY;
    // objects, like players, will have a rectangle
    public Rectangle solidArea = new Rectangle(0, 0, 48, 48);
    public int solidAreaDefaultX = 0;
    public int solidAreaDefaultY = 0;
    UtilityTool uTool = new UtilityTool();

    public void draw(Graphics2D g2, GamePanel gp, int x, int y) {
        g2.drawImage(image, x, y, gp.getTileSize(), gp.getTileSize(), null);
    }
    public int getWorldX(){
        return worldX;
    }
    public int getWorldY(){
        return worldY;
    }
    public void setWorldX(int x){
        worldX = x;
    }
    public void setWorldY(int y){
        worldY = y;
    }
}
