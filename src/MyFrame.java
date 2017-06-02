import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame(String text){
        super(text);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        super.setBounds(20, 20, 30,30);
        super.add(new MyCanvas());

        /*MyPanel newPanel = new MyPanel(100,100);
        newPanel.setLayout(new FlowLayout());
        newPanel.add(new MyButton("Кнопка", 100, 100));
        newPanel.add(new MyButton("+", 100, 100));
        newPanel.add(new MyButton("-", 100, 100));
        newPanel.add(new MyButton("Кнопка с длинной надписью", 100, 100));
        setContentPane(newPanel);*/

        super.setBounds(30, 30, 300, 300);
        super.getContentPane().add(new MyCanvas());
    }
}