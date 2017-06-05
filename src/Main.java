import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main (String [] args) throws IOException {

        MyFrame myWindow_1 = new MyFrame("myWindow_1");
        MyPanel myPanel = new MyPanel(300,300);
        MyButton myButton = new MyButton("myButton",100, 100);
        MyCanvas myCanvas = new MyCanvas();
        myWindow_1.setBounds(100, 100, 300,300);

        myWindow_1.add(myButton);
        myPanel.add(myCanvas);
        myWindow_1.add(myCanvas);
        //myWindow_1.removeAll();


        myWindow_1.setVisible(true);

        //MyFrame myWindow_2 = new MyFrame("myWindow_2");
        //myWindow_2.setBounds(200, 200, 200,200);
        //myWindow_2.setVisible(true);

        //MyFrame myWindow_3 = new MyFrame("myWindow_3");
        //myWindow_3.setBounds(400, 400, 300,300);
        //myWindow_3.setVisible(true);

    }


}
