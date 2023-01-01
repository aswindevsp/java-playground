import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class TrafficLightGUI extends Canvas implements ItemListener {
    JRadioButton r1, r2, r3;
    String state = null;
    TrafficLightGUI(JFrame j) {
        r1 = new JRadioButton("Red");
        r2 = new JRadioButton("Yellow");
        r3 = new JRadioButton("Green");

        r1.setBounds(20, 20, 100 , 30);
        r2.setBounds(20, 50, 100 , 30);
        r3.setBounds(20, 80, 100 , 30);

        ButtonGroup g = new ButtonGroup();
        g.add(r1);
        g.add(r2);
        g.add(r3);

        j.add(r1);
        j.add(r2);
        j.add(r3);

        r1.addItemListener(this);
        r2.addItemListener(this);
        r3.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        if(e.getSource() == r1) {
            state = "RED";  
            repaint();
        } else if(e.getSource() == r2) {
            state = "YELLOW";
            repaint();
        } else if(e.getSource() == r3) {
            state = "GREEN";
            repaint();
        }
    }

    public void paint(Graphics g) {

        g.setColor(Color.BLACK);
        g.fillRect(200, 120, 70, 260);
        g.setColor(Color.WHITE);

        if(state == null) {
            g.fillOval(205, 140, 60, 60);
            g.fillOval(205, 220, 60, 60);
            g.fillOval(205, 300, 60, 60);
        } else if(state == "RED") {
            g.setColor(Color.RED);
            g.fillOval(205, 140, 60, 60);
            g.setColor(Color.white);
            g.fillOval(205, 220, 60, 60);
            g.fillOval(205, 300, 60, 60);
        } else if(state == "YELLOW") {
            g.fillOval(205, 140, 60, 60);
            g.setColor(Color.YELLOW);
            g.fillOval(205, 220, 60, 60);
            g.setColor(Color.white);
            g.fillOval(205, 300, 60, 60);
        } else if(state == "GREEN") {
            g.fillOval(205, 140, 60, 60);
            g.fillOval(205, 220, 60, 60);
            g.setColor(Color.GREEN);
            g.fillOval(205, 300, 60, 60);
            g.setColor(Color.WHITE);
        }
    }
}
public class TrafficLight{
    public static void main(String[] args) {    
        JFrame j = new JFrame("Traffic Light");
        TrafficLightGUI gui = new TrafficLightGUI(j);

        j.add(gui);
        j.setSize(500,500);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}