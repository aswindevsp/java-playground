import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    public static void main(String args[]) {
        CalculatorFrame1 calculatorFrame = new
        CalculatorFrame1();
    }
}

class CalculatorFrame1 extends JFrame implements ActionListener {
	String s = "";
	Calculate calc = new Calculate();

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
        addBtn.setEnabled(false);
        multiBtn.setEnabled(false);
        divBtn.setEnabled(false);
        moduloBtn.setEnabled(false);
        equalsBtn.setEnabled(false);
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
    
    	//Numbers from 0-9
    	for(int i=0; i<11; i++) {
    		if(e.getSource() == digitBtn[i]) {
    			s += String.valueOf(i);
    			break;
    		}
    	}
    	
    	
    	if(e.getSource() == clearBtn) {
    		s = "";
    	}else if(e.getSource() == decimalBtn) {
    		s+= ".";
    	} else if(e.getSource() == addBtn) {
    		s+="+";
    	} else if(e.getSource() == subBtn) {
    		s+="-";
    	} else if(e.getSource() == multiBtn) {
    		s+="x";
    	} else if(e.getSource() == divBtn) {
    		s+="/";
    	} else if(e.getSource() == equalsBtn) {
    		s = calc.calculate(s);
    	}
    	
    	if(s != "") {
    		addBtn.setEnabled(true);
        	multiBtn.setEnabled(true);
        	divBtn.setEnabled(true);
        	moduloBtn.setEnabled(true);
        	equalsBtn.setEnabled(true);
    	} else {
    		addBtn.setEnabled(false);
        	multiBtn.setEnabled(false);
        	divBtn.setEnabled(false);
        	moduloBtn.setEnabled(false);
        	equalsBtn.setEnabled(false);
    	}
    	
    	
    	textField.setText(s);
    	
    }
}


class Calculate{

	static int evaluatePostfix(String exp)
    {
        //create a stack
        Stack<Integer> stack=new Stack<>();
         
        // Scan all characters one by one
        for(int i=0;i<exp.length();i++)
        {
            char c=exp.charAt(i);
             
            // If the scanned character is an operand (number here),
            // push it to the stack.
            if(Character.isDigit(c))
            stack.push(c - '0');
             
            //  If the scanned character is an operator, pop two
            // elements from stack apply the operator
            else
            {
                int val1 = stack.pop();
                int val2 = stack.pop();
                 
                switch(c)
                {
                    case '+':
                    stack.push(val2+val1);
                    break;
                     
                    case '-':
                    stack.push(val2- val1);
                    break;
                     
                    case '/':
                    stack.push(val2/val1);
                    break;
                     
                    case '*':
                    stack.push(val2*val1);
                    break;
              }
            }
        }
        return stack.pop();   
    }
    
    
    
	static int Prec(char ch)
    {
        switch (ch) {
        case '+':
        case '-':
            return 1;
 
        case '*':
        case '/':
            return 2;
 
        case '^':
            return 3;
        }
        return -1;
    }
 
    // The main method that converts
    // given infix expression
    // to postfix expression.
    static String infixToPostfix(String exp)
    {
        // initializing empty String for result
        String result = new String("");
 
        // initializing empty stack
        Deque<Character> stack
            = new ArrayDeque<Character>();
 
        for (int i = 0; i < exp.length(); ++i) {
            char c = exp.charAt(i);
 
            // If the scanned character is an
            // operand, add it to output.
            if (Character.isLetterOrDigit(c))
                result += c;
 
            // If the scanned character is an '(',
            // push it to the stack.
            else if (c == '(')
                stack.push(c);
 
            //  If the scanned character is an ')',
            // pop and output from the stack
            // until an '(' is encountered.
            else if (c == ')') {
                while (!stack.isEmpty()
                       && stack.peek() != '(') {
                    result += stack.peek();
                    stack.pop();
                }
 
                stack.pop();
            }
            else // an operator is encountered
            {
                while (!stack.isEmpty()
                       && Prec(c) <= Prec(stack.peek())) {
 
                    result += stack.peek();
                    stack.pop();
                }
                stack.push(c);
            }
        }
 
        // pop all the operators from the stack
        while (!stack.isEmpty()) {
            if (stack.peek() == '(')
                return "Invalid Expression";
            result += stack.peek();
            stack.pop();
        }
       
        return result;
    }
    
    public void calculate(String s) {
    	s = infixToPostfix(s);
    	int r = evaluatePostfix(s);
    	return String.valueOf(r);
    }
}
