import java.awt.*;
import javax.swing.*;

public class TrafficLight extends JPanel {
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    // Draw the traffic light pole
    g.setColor(Color.BLACK);
    g.fillRect(65, 50, 50, 100);

    // Draw the red light
    g.setColor(Color.RED);
    g.fillOval(90, 60, 40, 40);

    // Draw the yellow light
    g.setColor(Color.YELLOW);
    g.fillOval(90, 110, 40, 40);

    // Draw the green light
    g.setColor(Color.GREEN);
    g.fillOval(90, 160, 40, 40);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Traffic Light");
    frame.add(new TrafficLight());
    frame.setSize(300, 300);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TrafficLight extends JFrame {
    // constants for the dimensions of the window
    private static final int WIDTH = 300;
    private static final int HEIGHT = 400;

    // constants for the colors of the traffic lights
    private static final Color RED = new Color(255, 0, 0);
    private static final Color YELLOW = new Color(255, 255, 0);
    private static final Color GREEN = new Color(0, 255, 0);

    // constants for the dimensions of the traffic light
    private static final int LIGHT_WIDTH = 75;
    private static final int LIGHT_HEIGHT = 100;

    // constants for the position of the traffic light
    private static final int X_POS = 100;
    private static final int Y_POS = 50;

    // variables to keep track of the state of the traffic light
    private boolean redOn = false;
    private boolean yellowOn = false;
    private boolean greenOn = false;

    // radio buttons for selecting the traffic light
    private JRadioButton redButton;
    private JRadioButton yellowButton;
    private JRadioButton greenButton;

    public TrafficLight() {
        // create the radio buttons
        redButton = new JRadioButton("Red");
        yellowButton = new JRadioButton("Yellow");
        greenButton = new JRadioButton("Green");

        // create a button group to ensure only one radio button is selected at a time
        ButtonGroup group = new ButtonGroup();
        group.add(redButton);
        group.add(yellowButton);
        group.add(greenButton);

        // create a panel to hold the radio buttons
        JPanel panel = new JPanel();
        panel.add(redButton);
        panel.add(yellowButton);
        panel.add(greenButton);

        // add the panel to the frame
        add(panel, BorderLayout.SOUTH);

        // create an action listener for the radio buttons
        RadioButtonListener listener = new RadioButtonListener();
        redButton.addActionListener(listener);
        yellowButton.addActionListener(listener);
        greenButton.addActionListener(listener);

        // set the size and title of the window
        setSize(WIDTH, HEIGHT);
        setTitle("Traffic Light");

        // center the window on the screen
        setLocationRelativeTo(null);
        setVisible(true);
        // exit the program when the window is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // inner class to handle action events from the radio buttons
    private class RadioButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // determine which radio button was selected
            if (e.getSource() == redButton) {
                redOn = true;
                yellowOn = false;
                greenOn = false;
            } else if (e.getSource() == yellowButton) {
                redOn = false;
                yellowOn = true;
                greenOn = false;
            }
        }
    }
}

public class test{
    public static void main(String[] args) {
        TrafficLight t = new TrafficLight();
    }
}
