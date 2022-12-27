import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class Calculator {
    public static void main(String args[]) {
       new CalculatorFrame1();
    }
}

class CalculatorFrame1 extends JFrame implements ActionListener {

    //To store operands and operators
    Vector<String> vec = new Vector<String>();
    
    String display = ""; //Ouput display of the calc
 
    String temp = "";



    private String calc() {
        String op = "";
        try{
            while(vec.contains("*")) {
                int operatorPos = vec.indexOf("*");
                Double tempAns = Double.parseDouble(vec.elementAt(operatorPos-1)) * Double.parseDouble(vec.elementAt(operatorPos+1));

                vec.remove(operatorPos-1);
                vec.remove(operatorPos-1);
                vec.remove(operatorPos-1);

                vec.add(operatorPos-1, String.valueOf(tempAns));
            }

            while(vec.contains("/")) {
                int operatorPos = vec.indexOf("/");
                Double tempAns = Double.parseDouble(vec.elementAt(operatorPos-1)) / Double.parseDouble(vec.elementAt(operatorPos+1));

                vec.remove(operatorPos-1);
                vec.remove(operatorPos-1);
                vec.remove(operatorPos-1);

                vec.add(operatorPos-1, String.valueOf(tempAns));
            }

            while(vec.contains("+")) {
                int operatorPos = vec.indexOf("+");
                System.out.println(operatorPos);
                Double tempAns = Double.parseDouble(vec.elementAt(operatorPos-1)) + Double.parseDouble(vec.elementAt(operatorPos+1));
                
                vec.remove(operatorPos-1);
                vec.remove(operatorPos-1);
                vec.remove(operatorPos-1);

                vec.add(operatorPos-1, String.valueOf(tempAns));
            }

            while(vec.contains("-")) {
                int operatorPos = vec.indexOf("-");
                Double tempAns = Double.parseDouble(vec.elementAt(operatorPos-1)) - Double.parseDouble(vec.elementAt(operatorPos+1));

                vec.remove(operatorPos-1);
                vec.remove(operatorPos-1);
                vec.remove(operatorPos-1);

                vec.add(operatorPos-1, String.valueOf(tempAns));
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        op = vec.elementAt(0);
        vec.remove(0);
        return op;
    }



    JButton[] digitBtn;
    JButton clearBtn, decimalBtn, addBtn, subBtn, multiBtn, divBtn,moduloBtn, equalsBtn;
    JTextField textField;
    public CalculatorFrame1() {
        digitBtn = new JButton[11];
        for (int i = 0; i < 11; i++) {
            digitBtn[i] = new JButton(i + "");
            digitBtn[i].setMargin(new Insets(0, 0, 0, 0));
            add(digitBtn[i]);
        }
        textField = new JTextField();
        textField.setBounds(10, 10, 220, 40);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setBackground(Color.WHITE);
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        clearBtn = new JButton("C");
        clearBtn.setForeground(Color.WHITE);
        clearBtn.setBackground(Color.RED);
        clearBtn.setFont(new Font("Arial", Font.BOLD, 20));
        clearBtn.setMargin(new Insets(0, 0, 0, 0));

        decimalBtn = new JButton(".");
        decimalBtn.setFont(new Font("Arial", Font.BOLD, 20));
        decimalBtn.setMargin(new Insets(0, 0, 0, 0));
        addBtn = new JButton("+");
        addBtn.setFont(new Font("Arial", Font.BOLD, 20));
        addBtn.setMargin(new Insets(0, 0, 0, 0));
        subBtn = new JButton("-");
        subBtn.setFont(new Font("Arial", Font.BOLD, 20));
        subBtn.setMargin(new Insets(0, 0, 0, 0));
        multiBtn = new JButton("*");
        multiBtn.setFont(new Font("Arial", Font.BOLD, 20));
        multiBtn.setMargin(new Insets(0, 0, 0, 0));
        divBtn = new JButton("/");
        divBtn.setFont(new Font("Arial", Font.BOLD, 20));
        divBtn.setMargin(new Insets(0, 0, 0, 0));
        moduloBtn = new JButton("%");
        moduloBtn.setFont(new Font("Arial", Font.BOLD, 20));
        moduloBtn.setMargin(new Insets(0, 0, 0, 0));
        equalsBtn = new JButton("=");
        equalsBtn.setFont(new Font("Arial", Font.BOLD, 20));
        equalsBtn.setMargin(new Insets(0, 0, 0, 0));
        equalsBtn.setBackground(Color.GREEN);
        equalsBtn.setForeground(Color.WHITE);
        digitBtn[1].setBounds(10, 60, 40, 40);
        digitBtn[4].setBounds(10, 105, 40, 40);
        digitBtn[7].setBounds(10, 150, 40, 40);
        digitBtn[2].setBounds(55, 60, 40, 40);
        digitBtn[5].setBounds(55, 105, 40, 40);
        digitBtn[8].setBounds(55, 150, 40, 40);
        digitBtn[3].setBounds(100, 60, 40, 40);
        digitBtn[6].setBounds(100, 105, 40, 40);
        digitBtn[9].setBounds(100, 150, 40, 40);
        digitBtn[0].setBounds(55, 195, 40, 40);
        clearBtn.setBounds(10, 195, 40, 40);
        decimalBtn.setBounds(100, 195, 40, 40);

        divBtn.setBounds(145, 60, 40, 40);
        multiBtn.setBounds(145, 105, 40, 40);
        subBtn.setBounds(145, 150, 40, 40);
        addBtn.setBounds(145, 195, 40, 40);
        moduloBtn.setBounds(190, 60, 40, 40);
        equalsBtn.setBounds(190, 105, 40, 130);
        for (int i = 0; i < 11; i++)
            digitBtn[i].addActionListener(this);
        addBtn.addActionListener(this);
        subBtn.addActionListener(this);
        multiBtn.addActionListener(this);
        divBtn.addActionListener(this);
        moduloBtn.addActionListener(this);
        equalsBtn.addActionListener(this);
        decimalBtn.addActionListener(this);
        clearBtn.addActionListener(this);
        add(textField);
        add(addBtn);
        add(subBtn);
        add(multiBtn);
        add(divBtn);
        add(moduloBtn);
        add(equalsBtn);
        add(clearBtn);
        add(decimalBtn);
        setLayout(null);
        setVisible(true);
        setSize(250, 280);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   
    public void actionPerformed(ActionEvent e) {
        
        for(int i=0; i<11; i++){
            if(e.getSource() == digitBtn[i]) {
                temp += String.valueOf(i);
                display += String.valueOf(i);
            }
        }

        if(e.getSource() == subBtn) {
            if(temp.isBlank()) {
                temp = "-";
            } else {
                vec.add(temp);
                vec.add("-");
                temp = "";
            } 
            display+="-";
        } else if(e.getSource() == addBtn) {
            vec.add(temp);
            vec.add("+");
            temp = "";
            display+="+";
        } else if(e.getSource() == multiBtn) {
            vec.add(temp);
            vec.add("*");
            temp = "";
            display+="*";
        } else if(e.getSource() == divBtn) {
            vec.add(temp);
            vec.add("/");
            temp = "";
            display+="/";
        } else if(e.getSource() == decimalBtn) {
            temp += ".";
            display+=".";
        } 
        else if(e.getSource() == clearBtn) {
            vec.clear();
            temp = "";
            display = "";
        } else if(e.getSource() == equalsBtn) {
            if(!temp.isBlank()) {
                vec.add(temp);
                System.out.println("Calc Vec: " + vec);
                temp = "";
            }            
            display = String.valueOf(calc());

            //nessosory for calculator to work after one operation
            temp = display;
        }

        System.out.println("Calc Vec: " + vec);
        textField.setText(display);

    }
}
