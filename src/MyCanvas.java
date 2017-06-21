import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

class MyCanvas extends JComponent {

    @Override
    public void paint(Graphics g) {

        try {
            Image image = ImageIO.read(new File("C:\\GitHub\\JavaSwingTest\\src\\img\\ace.png"));
            g.drawImage(image, Model.getX(), Model.getY(), null);
            g.finalize();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
