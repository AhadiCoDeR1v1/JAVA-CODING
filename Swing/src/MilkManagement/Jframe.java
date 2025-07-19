package MilkManagement;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;

class Jframetut implements ActionListener {
    JFrame frame;
    JLabel lb;
    JLabel lb1;
    JButton btn;
    JPanel panel;
    JPanel panel1;
    public Jframetut() {
        frame = new JFrame();
        ImageIcon icon = new ImageIcon(getClass().getResource("logo1.jpg"));
        Border bd = BorderFactory.createLineBorder(Color.black);
        lb = new JLabel("Milk Management System");
        lb1 = new JLabel();
        lb1.setIcon(icon);
        lb.setHorizontalTextPosition(JLabel.CENTER);
        lb.setVerticalTextPosition(JLabel.TOP);
        lb.setOpaque(true);
        lb.setBackground(Color.LIGHT_GRAY);
        lb.setBorder(bd);
        lb.setHorizontalAlignment(JLabel.CENTER);
        lb.setVerticalAlignment(JLabel.TOP);
        lb.setBounds(200,0,200,20);
        lb1.setBounds(0,20,200,200);

        btn=new JButton();
        btn.setBounds(200,40,200,20);
        btn.setBackground(Color.LIGHT_GRAY);
        btn.setOpaque(true);
        btn.setText("Click me");
        btn.setFocusable(false);
        btn.addActionListener(this);


        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.green);
        panel.setPreferredSize(new Dimension(300,300));
        panel.add(lb);
        panel.add(btn);


        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBackground(Color.red);
        panel1.setPreferredSize(new Dimension(300,300));



        frame.setTitle("Milk Management System");
        frame.setIconImage(icon.getImage());
        frame.setSize(600,600);
        frame.setLayout(new BorderLayout());
        frame.setIconImage(icon.getImage());
        frame.getContentPane().setBackground(Color.cyan); // or we can generate cusrom by new color(some valuframe
        frame.add(panel,BorderLayout.CENTER);
        frame.add(panel1,BorderLayout.SOUTH);






        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Jframetut frame = new Jframetut();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()==btn){
//             frame.dispose();
             MilkList list = new MilkList();
         }
    }
}
