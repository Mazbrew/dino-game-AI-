import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.awt.event.KeyEvent;

public class App {
    public static void main(String[] args) throws Exception {
        Robot robo = new Robot();
        BufferedImage img;
        int clr;

        while(true){
            img = robo.createScreenCapture(new Rectangle(300,425,1,1));
            clr = img.getRGB(0, 0);

            if(clr == -5460820){
                System.out.println(clr);
                robo.keyPress(KeyEvent.VK_SPACE);
            }
        }
    }
}
