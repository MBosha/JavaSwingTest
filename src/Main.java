import javax.swing.*;

public class Main {

    public static void main (String [] args) {

        //MyFrame myWindow_1 = new MyFrame("myWindow_1");
        //myWindow_1.setBounds(100, 100, 100,100);
        //myWindow_1.setVisible(true);

        //MyFrame myWindow_2 = new MyFrame("myWindow_2");
        //myWindow_2.setBounds(200, 200, 200,200);
        //myWindow_2.setVisible(true);

        //MyFrame myWindow_3 = new MyFrame("myWindow_3");
        //myWindow_3.setBounds(400, 400, 300,300);
        //myWindow_3.setVisible(true);

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(30, 30, 300, 300);
        window.getContentPane().add(new MyCanvas());
        window.setVisible(true);

    }


}
