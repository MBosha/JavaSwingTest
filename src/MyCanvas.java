import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

class MyCanvas extends JComponent {

    public MyCanvas() {
    }

    @Override
    public void paint(Graphics g) {
        //Graphics g2 = (Graphics) g;

        try {
            Image image;
            image = ImageIO.read(new File("C:\\GitHub\\JavaSwingTest\\src\\img\\ace.png"));
            g.drawImage(image, 0, 0, null);
            g.finalize();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
