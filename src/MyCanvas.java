import javax.swing.*;
import java.awt.*;

import static java.awt.Toolkit.*;

class MyCanvas extends JComponent {

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        Image img1 = getDefaultToolkit().getImage("img/ace.png");
        g2.drawImage(img1, 10, 10, this);
        g2.finalize();
    }
}