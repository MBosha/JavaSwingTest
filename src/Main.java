import javafx.event.ActionEvent;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.*;

import java.util.Random;


public class Main {

    public static void main (String [] args) throws IOException, InterruptedException {

        MyFrame myWindow_1 = new MyFrame("myWindow_1");
        //MyPanel myPanel = new MyPanel(300,300);
        //MyButton myButton = new MyButton("myButton",100, 100);
        MyCanvas myCanvas_1 = new MyCanvas();
        MyCanvas myCanvas_2 = new MyCanvas();

        myWindow_1.setBounds(200, 200, 300, 300);

        //myWindow_1.add(myButton);
        //myWindow_1.add(myPanel);
        //myPanel.add(myCanvas);

        myWindow_1.setVisible(true);

        for (int i = 0; i < 199; i++) {

            int a = i % 2;

            //myCanvas = new MyCanvas();

            if (a == 0) {
                Model.setX(i);
                Model.setY(i);
                myWindow_1.add(myCanvas_1, 0);
                Model.setX(i + 1);
                Model.setY(i + 1);
                myWindow_1.add(myCanvas_2, 1);
            }

            /*if (a == 1) {
                myWindow_1.remove(myCanvas_1);
            }*/

            myWindow_1.repaint();
            Thread.sleep(50);

            JFrame app = new Pyatnashki();
            app.setVisible(true);
        }


        //MyFrame myWindow_2 = new MyFrame("myWindow_2");
        //myWindow_2.setBounds(200, 200, 200,200);
        //myWindow_2.setVisible(true);

        //MyFrame myWindow_3 = new MyFrame("myWindow_3");
        //myWindow_3.setBounds(400, 400, 300,300);
        //myWindow_3.setVisible(true);


    }
}
