import javax.swing.*;

public class MyButton extends JButton {

    MyButton(String text, int width, int height){
        super(text, null);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(width, height);
    }
}
