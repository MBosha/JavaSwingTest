import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

class MyCanvas extends JComponent {

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        try {
            BufferedImage image = ImageIO.read(new java.io.File("img/ace.png"));
            g2.drawImage(image, 10, 10, null);
            //g2.finalize();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Image img1 = Toolkit.getDefaultToolkit().getImage("img/ace.png");

    }
}