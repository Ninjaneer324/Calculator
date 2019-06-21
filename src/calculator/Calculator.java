package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class Calculator implements ActionListener {
  
  private final JFrame frame = new JFrame();
  private Double number = 0.0;
  private Double answer = 0.0;
  private final JButton btnPlusOrMinus = new JButton("+/-");
  private final JButton btnClear = new JButton("CC");
  private final JButton btnPlus = new JButton("+");
  private final JButton btnMinus = new JButton("-");
  private final JButton btnMultiply = new JButton("*");
  private final JButton btnDivide = new JButton("/");
  private final JButton btnSquareRoot = new JButton("\u221A");
  private final JButton btnEquals = new JButton("=");
  private final JButton btnDelete = new JButton("Del");
  private final JButton btn1 = new JButton("1");
  private final JButton btn2 = new JButton("2");
  private final JButton btn3 = new JButton("3");
  private final JButton btn4 = new JButton("4");
  private final JButton btn5 = new JButton("5");
  private final JButton btn6 = new JButton("6");
  private final JButton btn7 = new JButton("7");
  private final JButton btn8 = new JButton("8");
  private final JButton btn9 = new JButton("9");
  private final JButton btn0 = new JButton("0");
  private final JButton btnDecimal = new JButton(".");
  private JLabel label = new JLabel();
  private JTextField txt = new JTextField("");
  //private ArrayList<String> operators = new ArrayList<String>();
  private String calculation = "";
  private int ops = 0;

  public Calculator(){
    frame.setTitle("Calculator");
    frame.setSize(600, 600);
    frame.getContentPane().setLayout(null);
    int r = (int) (Math.random() * 256) + 0;
    int g = (int) (Math.random() * 256) + 0;
    int b = (int) (Math.random() * 256) + 0;
    frame.getContentPane().setBackground(new Color(r, g, b));
    frame.setResizable(false);
    frame.setLocationRelativeTo(null);
    //frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    addComponents();    
    addEvents();   
    frame.setVisible(true);
  }

  private void addComponents(){
    label.setBounds(450, 0, 50, 50);
    frame.add(label);
    
    txt.setBounds(10,60,580,100);
    txt.setFont(new Font("Arial", Font.BOLD, 20));
    txt.setHorizontalAlignment(SwingConstants.RIGHT);
    frame.add(txt);
    
    btnPlusOrMinus.setBounds(390,170,90,25);
    btnPlusOrMinus.setFont(new Font("Arial", Font.PLAIN, 15));
    frame.add(btnPlusOrMinus);
    
    btnClear.setBounds(500,170,90,25);
    btnClear.setFont(new Font("Arial", Font.PLAIN, 15));
    frame.add(btnClear);
    
    btnPlus.setBounds(390,205,90,25);
    btnPlus.setFont(new Font("Arial", Font.PLAIN, 15));
    frame.add(btnPlus);
    
    btnMinus.setBounds(500,205,90,25);
    btnMinus.setFont(new Font("Arial", Font.PLAIN, 15));
    frame.add(btnMinus);
    
    btnMultiply.setBounds(390,240,90,25);
    btnMultiply.setFont(new Font("Arial", Font.PLAIN, 15));
    frame.add(btnMultiply);
    
    btnDivide.setBounds(500,240,90,25);
    btnDivide.setFont(new Font("Arial", Font.PLAIN, 15));
    frame.add(btnDivide);
    
    btnSquareRoot.setBounds(390, 275, 90, 25);
    btnSquareRoot.setFont(new Font("Arial", Font.PLAIN, 15));
    frame.add(btnSquareRoot);
    
    btn1.setBounds(10,170,100,80);
    btn1.setFont(new Font("Arial", Font.PLAIN, 15));
    frame.add(btn1);
    
    btn2.setBounds(140,170,100,80);
    btn2.setFont(new Font("Arial", Font.PLAIN, 15));
    frame.add(btn2);
    
    btn3.setBounds(270,170,100,80);
    btn3.setFont(new Font("Arial", Font.PLAIN, 15));
    frame.add(btn3);
    
    btn4.setBounds(10,265,100,80);
    btn4.setFont(new Font("Arial", Font.PLAIN, 15));
    frame.add(btn4);
    
    btn5.setBounds(140,265,100,80);
    btn5.setFont(new Font("Arial", Font.PLAIN, 15));
    frame.add(btn5);
    
    btn6.setBounds(270,265,100,80);
    btn6.setFont(new Font("Arial", Font.PLAIN, 15));
    frame.add(btn6);
    
    btn7.setBounds(10,360,100,80);
    btn7.setFont(new Font("Arial", Font.PLAIN, 15));
    frame.add(btn7);
    
    btn8.setBounds(140,360,100,80);
    btn8.setFont(new Font("Arial", Font.PLAIN, 15));
    frame.add(btn8);
    
    btn9.setBounds(270,360,100,80);
    btn9.setFont(new Font("Arial", Font.PLAIN, 15));
    frame.add(btn9);
    
    btnDelete.setBounds(10,455,100,80);
    btnDelete.setFont(new Font("Arial", Font.PLAIN, 15));
    frame.add(btnDelete);
    
    btn0.setBounds(140,455,100,80);
    btn0.setFont(new Font("Arial", Font.PLAIN, 15));
    frame.add(btn0);
    
    btnDecimal.setBounds(270,455,100,80);
    btnDecimal.setFont(new Font("Arial", Font.PLAIN, 15));
    frame.add(btnDecimal);
    
    btnEquals.setBounds(390,510, 200,25);
    btnEquals.setFont(new Font("Arial", Font.PLAIN, 15));
    frame.add(btnEquals); 
  }

  private void addEvents(){
    btnPlusOrMinus.addActionListener(this);
    btnClear.addActionListener(this);
    btnPlus.addActionListener(this);
    btnMinus.addActionListener(this);
    btnMultiply.addActionListener(this);
    btnDivide.addActionListener(this);
    btnSquareRoot.addActionListener(this);
    btn1.addActionListener(this);
    btn2.addActionListener(this);
    btn3.addActionListener(this);
    btn4.addActionListener(this);
    btn5.addActionListener(this);
    btn6.addActionListener(this);
    btn7.addActionListener(this);
    btn8.addActionListener(this);
    btn9.addActionListener(this);
    btnDelete.addActionListener(this);
    btn0.addActionListener(this);
    btnDecimal.addActionListener(this);
    btnEquals.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    Object buttonPressed = e.getSource();
    if(buttonPressed == btn1)
        txt.setText(txt.getText() + "1");
    else if(buttonPressed == btn2)
        txt.setText(txt.getText() + "2");
    else if(buttonPressed == btn3)
        txt.setText(txt.getText() + "3");
    else if(buttonPressed == btn4)
        txt.setText(txt.getText() + "4");
    else if(buttonPressed == btn5)
        txt.setText(txt.getText() + "5");
    else if(buttonPressed == btn6)
        txt.setText(txt.getText() + "6");
    else if(buttonPressed == btn7)
        txt.setText(txt.getText() + "7");
    else if(buttonPressed == btn8)
        txt.setText(txt.getText() + "8");
    else if(buttonPressed == btn9)
        txt.setText(txt.getText() + "9");
    else if (buttonPressed == btnDelete) {
            int length = txt.getText().length();
            if (length > 0) {
                String back = txt.getText().substring(0, length - 1);
                txt.setText(back);
            }
            else {
              txt.setText("");
              label.setText("");
              number = 0.0;
              answer = 0.0;
              ops = 0;
              calculation = "";
            }
    }
    
    else if (buttonPressed == btn0 && !txt.getText().equals("0")) {
        //label.setText(label.getText() + "0");
        txt.setText(txt.getText() + "0");
    }
    
    else if(buttonPressed == btnDecimal && !txt.getText().contains("."))
        txt.setText(txt.getText() + ".");
    
    else if(buttonPressed == btnPlusOrMinus) {
        number = Double.parseDouble(txt.getText());
        if(txt.getText().charAt(0) == '-'){
            txt.setText(txt.getText().substring(1));
        }
        else {
            txt.setText("-"+txt.getText());
        }
    }
    
    else if (buttonPressed == btnClear) {
              //Clearing texts of label and text field
              txt.setText("");
              label.setText("");
              number = 0.0;
              answer = 0.0;
              ops = 0;
              calculation = "";
              //operators.clear();
    }
    else if (buttonPressed == btnPlus) {
        number = Double.parseDouble(txt.getText());
        if(ops == 0)
            answer = number;
        else { 
            switch(calculation) {
                case "+":
                    answer += number;
                    break;
                case "-":
                    answer -= number;
                    break;
                case "*":
                    answer *= number;
                    break;
                case "/":
                    answer /= number;
                    break;
            }
        }
        txt.setText("");
        if (Double.toString(answer).endsWith(".0")) {
            label.setText(Double.toString(answer).replace(".0", "") + " + ");
        } 
        else {
            label.setText(Double.toString(answer)  + " + ");
        }
        calculation = "+";
        ops++;
    }
    else if (buttonPressed == btnMinus) {
            //String str = txt.getText();
        number = Double.parseDouble(txt.getText());
        if(ops == 0)
            answer = number;
        else { 
            switch(calculation) {
                case "+":
                    answer += number;
                    break;
                case "-":
                    answer -= number;
                    break;
                case "*":
                    answer *= number;
                    break;
                case "/":
                    answer /= number;
                    break;
            }
        }
        txt.setText("");
        if (Double.toString(answer).endsWith(".0")) {
            label.setText(Double.toString(answer).replace(".0", "") + " - ");
        } 
        else {
            label.setText(Double.toString(answer)  + " - ");
        }
        calculation = "-";
        ops++;
    }
    else if (buttonPressed == btnMultiply) {
        number = Double.parseDouble(txt.getText());
        if(ops == 0)
            answer = number;
        else { 
            switch(calculation) {
                case "+":
                    answer += number;
                    break;
                case "-":
                    answer -= number;
                    break;
                case "*":
                    answer *= number;
                    break;
                case "/":
                    answer /= number;
                    break;
            }
        }
        txt.setText("");
        if (Double.toString(answer).endsWith(".0")) {
            label.setText(Double.toString(answer).replace(".0", "") + " x ");
        } 
        else {
            label.setText(Double.toString(answer)  + " x ");
        }
        calculation = "*";
        ops++;
    } 
    else if (buttonPressed == btnDivide) {
        number = Double.parseDouble(txt.getText());
        if(ops == 0)
            answer = number;
        else {
            //number = Double.parseDouble(txt.getText());
            switch(calculation) {
                case "+":
                    answer += number;
                    break;
                case "-":
                    answer -= number;
                    break;
                case "*":
                    answer *= number;
                    break;
                case "/":
                    answer /= number;
                    break;
            }
        }
        txt.setText("");
        if (Double.toString(answer).endsWith(".0")) {
            label.setText(Double.toString(answer).replace(".0", "") + " / ");
        } 
        else {
                label.setText(Double.toString(answer)  + " / ");
        }
        calculation = "/";
        ops++;
    }

    else if(buttonPressed == btnSquareRoot) {
        number = Math.sqrt(Double.parseDouble(txt.getText()));
        if (Double.toString(number).endsWith(".0")) {
            txt.setText(Double.toString(number).replace(".0", "") + "");
        } 
        else {
                txt.setText(Double.toString(number)  + "");
        }
    }
    else if(buttonPressed == btnEquals) {
        number = Double.parseDouble(txt.getText());
        switch (calculation) {
                case "+":
                    answer += number;
                    break;
                case "-":
                    answer -= number;
                    break;
                case "*":
                    answer *= number;
                    break;
                case "/":
                    answer /= number;
                    break;
                case "":
                    answer = number;
                    break;
            }
            if(!calculation.equals("")) {
                if (Double.toString(answer).endsWith(".0"))
                    txt.setText(Double.toString(answer).replace(".0", ""));
                else
                    txt.setText(Double.toString(answer));
            }
            else
                txt.setText("");
            label.setText("");
            number = 0.0;
            answer = 0.0;
            ops = 0;
            calculation = "";
    }
  }
    
    
    //Fix any label issues
    //Continuous operation seems to be working
    //More testing needed
    //Add more functions/buttons
    
  
}
