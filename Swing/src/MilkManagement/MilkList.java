package MilkManagement;

import javax.swing.*;

public class MilkList extends JFrame {
    JFrame frame;
    MilkList(){
        frame  = new JFrame("Milk List");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}
