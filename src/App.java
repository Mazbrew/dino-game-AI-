import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.event.KeyEvent;

public class App {
    public static void main(String[] args) throws Exception {
        Robot robo = new Robot();
        BufferedImage img;
        int clr,red,green,blue;

        while(true){
            img = robo.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
            clr = img.getRGB(300, 400);

            red = (clr & 0x00ff0000) >> 16;
            green = (clr & 0x0000ff00) >> 8;
            blue = clr & 0x000000ff;


            if(red == 172 && blue == 172 && green == 172){
                robo.keyPress(KeyEvent.VK_SPACE);
            }
        }
    }
}
