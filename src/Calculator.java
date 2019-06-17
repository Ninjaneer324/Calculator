import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculator implements ActionListener {
  
  private JFrame frame = new JFrame();
  private Double number = 0.0;
  private boolean equalsPressed = false;
  private JButton btnPlus = new JButton("+");
  private JButton btnMinus = new JButton("-");
  private JButton btnMultiply = new JButton("*");
  private JButton btnDivide = new JButton("/");
  private JButton btnPlusOrMinus = new JButton("+/-");
  private JButton btnEquals = new JButton("=");
  private JButton btnClear = new JButton("CC");
  private JButton btnDelete = new JButton("Del");
  private JButton btn1 = new JButton("1");
  private JButton btn2 = new JButton("2");
  private JButton btn3 = new JButton("3");
  private JButton btn4 = new JButton("4");
  private JButton btn5 = new JButton("5");
  private JButton btn6 = new JButton("6");
  private JButton btn7 = new JButton("7");
  private JButton btn8 = new JButton("8");
  private JButton btn9 = new JButton("9");
  private JButton btn0 = new JButton("0");
  private JButton btnDecimal = new JButton(".");
  private boolean equalPressed = false;
  private JLabel label = new JLabel();
  private JTextField txt = new JTextField();


  public Calculator(){
    frame.setTitle("Calculator");
    frame.setSize(600, 600);
    frame.getContentPane().setLayout(null);
    frame.getContentPane().setBackground(Color.red);
    frame.setResizable(false);
    frame.setLocationRelativeTo(null);
    //frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    addComponents();    
    addEvents();   
    frame.setVisible(true);
  }

  private void addComponents(){
    //btnClose.setBounds(300,130, 80,25);
    label.setBounds(450, 0, 50, 50);
    txt.setBounds(10,60,580,100);
    btnPlusOrMinus.setBounds(390,170,90,25);
    btnClear.setBounds(500,170,90,25);
    btnPlus.setBounds(390,205,90,25);
    btnMinus.setBounds(500,205,90,25);
    btnMultiply.setBounds(390,240,90,25);
    btnDivide.setBounds(500,240,90,25);
    btn1.setBounds(10,170,100,80);
    btn2.setBounds(140,170,100,80);
    btn3.setBounds(270,170,100,80);
    btn4.setBounds(10,265,100,80);
    btn5.setBounds(140,265,100,80);
    btn6.setBounds(270,265,100,80);
    btn7.setBounds(10,360,100,80);
    btn8.setBounds(140,360,100,80);
    btn9.setBounds(270,360,100,80);
    btnDelete.setBounds(10,455,100,80);
    btn0.setBounds(140,455,100,80);
    btnDecimal.setBounds(270,455,100,80);
    //txtB.setBounds(100,35,100,20);
    //txtC.setBounds(100,65,100,20);

    //lblA.setBounds(20,10,100,20);
    //lblB.setBounds(20,35,100,20);
    //lblC.setBounds(20,65,100,20);


    //add(btnClose);
    frame.add(label);
    frame.add(txt);
    frame.add(btnPlusOrMinus);
    frame.add(btnClear);
    frame.add(btnPlus);
    frame.add(btnMinus);
    frame.add(btnMultiply);
    frame.add(btnDivide);
    frame.add(btn1);
    frame.add(btn2);
    frame.add(btn3);
    frame.add(btn4);
    frame.add(btn5);
    frame.add(btn6);
    frame.add(btn7);
    frame.add(btn8);
    frame.add(btn9);
    frame.add(btnDelete);
    frame.add(btn0);
    frame.add(btnDecimal);
    //add(lblA);
    //add(lblB);
    //add(lblC);
    //add(txtB);
    //add(txtC);
  }

  private void addEvents(){
    btnPlus.addActionListener(this);
    btnMinus.addActionListener(this);
    btnMultiply.addActionListener(this);
    btnDivide.addActionListener(this);
    btnPlusOrMinus.addActionListener(this);
    btnEquals.addActionListener(this);
    btnClear.addActionListener(this);
    btn1.addActionListener(this);
    btn2.addActionListener(this);
    btn3.addActionListener(this);
    btn4.addActionListener(this);
    btn5.addActionListener(this);
    btn6.addActionListener(this);
    btn7.addActionListener(this);
    btn8.addActionListener(this);
    btn9.addActionListener(this);
    btn0.addActionListener(this);
    btnDecimal.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    Object buttonPressed = e.getSource();
    if (buttonPressed == btnClear) {
              //Clearing texts of label and text field
              label.setText("");
              txt.setText("");
              number = 0.0;
    }
    else if (buttonPressed == btnDelete) {
            int length = txt.getText().length();
            int number = length - 1;
            if (length > 0) {
                StringBuilder back = new StringBuilder(txt.getText());
                back.deleteCharAt(number);
                txt.setText(back.toString());
 
            }
            if (txt.getText().endsWith("")) {
                label.setText("");
            }
    }
    
    else if (buttonPressed == btn0 && !txt.getText().equals("0"))
        txt.setText(txt.getText() + "0");
    else if(buttonPressed == btnDecimal && txt.getText().indexOf(".") < 0)
        txt.setText(txt.getText() + ".");
    else if(buttonPressed == btn1)
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
    //Add plus, minus, etc. and make sure it was continuous multi-operation ability
    //Fix the above label issue
    //Maybe try stack or array to keep track of operations and use the last thing inputted when a number is inputted
    //Erase comments and add new ones before commit
  }
  
}