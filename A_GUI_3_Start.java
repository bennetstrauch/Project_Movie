import javax.swing.*;
import java.awt.*;

public class A_GUI_3_Start extends A_GUI_1_Super {

    //TEST CLASS
    public static void main(String[] args) {
        new A_GUI_3_Start();
    }



    public A_GUI_3_Start(){
        startFrame = new JFrame();
        startFrame.setSize(400,400);

        JTextField description = new JTextField("Welcome!##");
        JButton start = new JButton("Start");
        start.addActionListener(e -> menu());


        startFrame.add(description);
        startFrame.add(start);

        startFrame.setLayout(new GridLayout(2,1));
        startFrame.setVisible(true);
    }

    public static void menu(){
        startFrame.dispose();
        menuFrame = new JFrame();
        menuFrame.setSize(400,200);

        JTextField e1 = new JTextField("##");

        menuFrame.add(e1);
        menuFrame.setLayout(new GridLayout());
        menuFrame.setVisible(true);
    }
}
