package Keybind;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.*;


public class Game {
    JFrame frame;
    JLabel lb1;
    upaction up;
    downaction dn;
    leftaction lf;
    rightaction rf;
    Game(){
        lb1=new JLabel();
        lb1.setBackground(Color.RED);
        lb1.setOpaque(true);
        lb1.setSize(100,100);
        lb1.setBounds(100,100,100,100);

        up=new upaction();
        dn=new downaction();
        lf=new leftaction();
        rf=new rightaction();

        lb1.getInputMap().put(KeyStroke.getKeyStroke('w'),"upk");
        lb1.getActionMap().put("upk",up);
        lb1.getInputMap().put(KeyStroke.getKeyStroke('s'),"dwk");
        lb1.getActionMap().put("dwk",dn);
        lb1.getInputMap().put(KeyStroke.getKeyStroke('a'),"lft");
        lb1.getActionMap().put("lft",lf);
        lb1.getInputMap().put(KeyStroke.getKeyStroke('d'),"rgt");
        lb1.getActionMap().put("rgt",rf);



        frame=new JFrame();
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.add(lb1);
        frame.setVisible(true);
    }
    private class upaction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
             lb1.setLocation(lb1.getX(),lb1.getY()-10);
        }
    }
    private class downaction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            lb1.setLocation(lb1.getX(),lb1.getY()+10);
        }
    }
    private class leftaction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            lb1.setLocation(lb1.getX()-10,lb1.getY());
        }
    }
    private class rightaction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            lb1.setLocation(lb1.getX()+10,lb1.getY());
        }
    }
}
