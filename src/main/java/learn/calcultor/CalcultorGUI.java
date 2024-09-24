package learn.calcultor;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.JobAttributes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class CalcultorGUI {
    public static boolean isDarkmode = false;
    public static void main(String[] args) {
        
        Font f1 =new Font("Times New Roman",Font.BOLD , 18) ;
        Font f2 =new Font("Times New Roman",Font.BOLD , 28) ;
        Font f3 = new Font("Times New Roman", Font.BOLD , 23);
        
        JFrame frame = new JFrame("Calcultor");
        frame.setSize(435,420);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Mosa_Calcultor");
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLayout(null);
        ///////////////////////////////////////////////////////////////////
        
        JLabel OldValue = new JLabel("0");
        JLabel op = new JLabel("+");
        JLabel newvalue = new JLabel("0");
        
        JButton btn0 = new JButton("0");
        JButton btndot = new JButton(".");
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
        JButton btn9 = new JButton("9");
        JButton btnplus = new JButton("+");
        JButton btnmin = new JButton("-");
        JButton btnmult = new JButton("*");
        JButton btndiv = new JButton("/");
        JButton btnequal = new JButton("=");
        JButton btnremove = new JButton("CE");
        JButton btnclear = new JButton("C");
        JButton btnsign = new JButton("+/-");
        JButton btnDarkMode = new JButton("Dark");
        
        
        //////////////////////////////////////////////////////////////////////
        
        OldValue.setBounds(5, 5, 380, 25);
        op.setBounds(390, 5, 15, 25);
        newvalue.setBounds(5, 30, 400, 100);
        btnDarkMode.setBounds(2, 5, 60, 20);
        btnsign.setBounds(2, 135, 100, 40);
        btnclear.setBounds(105, 135, 100, 40);
        btnremove.setBounds(210, 135, 100, 40);
        btndiv.setBounds(315, 135, 100, 40);
        btn7.setBounds(2, 180, 100, 40);
        btn8.setBounds(105, 180, 100, 40);
        btn9.setBounds(210, 180, 100, 40);
        btnmult.setBounds(315, 180, 100, 40);
        btn4.setBounds(2, 225, 100, 40);
        btn5.setBounds(105, 225, 100, 40);
        btn6.setBounds(210, 225, 100, 40);
        btnmin.setBounds(315, 225, 100, 40);
        btn1.setBounds(2, 270, 100, 40);
        btn2.setBounds(105, 270, 100, 40);
        btn3.setBounds(210, 270, 100, 40);
        btnplus.setBounds(315, 270, 100, 40);
        btn0.setBounds(2, 315, 205, 40);
        btndot.setBounds(210, 315, 100, 40);
        btnequal.setBounds(315, 315, 100, 40);

        
        /////////////////////////////////////////////////////////////////////
        
        OldValue.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        newvalue.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        
        //////////////////////////// Font /////////////////////////////////////////
        
        OldValue.setFont(f1);
        newvalue.setFont(f2);
        btndot.setFont(f1);
        btnequal.setFont(f3);
        btnplus.setFont(f3);
        btnmin.setFont(f3);
        btnmult.setFont(f3);
        btnremove.setFont(f3);
        btnclear.setFont(f3);
        btnsign.setFont(f3);
        btndiv.setFont(f3);
        btn0.setFont(f1);
        btn1.setFont(f1);
        btn2.setFont(f1);
        btn3.setFont(f1);
        btn4.setFont(f1);
        btn5.setFont(f1);
        btn6.setFont(f1);
        btn7.setFont(f1);
        btn8.setFont(f1);
        btn9.setFont(f1);
        op.setFont(f1);
  
    
        
        ////////////////////////////////////////////////////////////////////
        
        frame.getContentPane().setBackground(Color.WHITE);
        OldValue.setBackground(Color.white);
        OldValue.setOpaque(true);
        op.setBackground(Color.white);
        op.setOpaque(true);
        newvalue.setBackground(Color.white);
        newvalue.setOpaque(true);
        btnequal.setBackground(Color.WHITE);
        btnDarkMode.setBackground(Color.gray);
        btnplus.setBackground(new Color(230, 230, 230));
        btnmin.setBackground(new Color(230, 230, 230));
        btnmult.setBackground(new Color(230, 230, 230));
        btnremove.setBackground(new Color(230, 230, 230));
        btnclear.setBackground(new Color(230, 230, 230));
        btnsign.setBackground(new Color(230, 230, 230));
        btndiv.setBackground(new Color(230, 230, 230));
        btn0.setBackground(Color.white);
        btn1.setBackground(Color.white);
        btn2.setBackground(Color.white);
        btn3.setBackground(Color.white);
        btn4.setBackground(Color.white);
        btn5.setBackground(Color.white);
        btn6.setBackground(Color.white);
        btn7.setBackground(Color.white);
        btn8.setBackground(Color.white);
        btn9.setBackground(Color.white);
        btndot.setBackground(Color.white);
        
        ////////////////////////////////////////////////////////////////////
        
        btndot.setForeground(Color.black);
        btnDarkMode.setForeground(Color.WHITE);
        btnequal.setForeground(Color.black);
        btnplus.setForeground(Color.black);
        btnmin.setForeground(Color.black);
        btnmult.setForeground(Color.black);
        btnremove.setForeground(Color.black);
        btnclear.setForeground(Color.black);
        btnsign.setForeground(Color.black);
        btndiv.setForeground(Color.black);
        btn0.setForeground(Color.black);
        btn1.setForeground(Color.black);
        btn2.setForeground(Color.black);
        btn3.setForeground(Color.black);
        btn4.setForeground(Color.black);
        btn5.setForeground(Color.black);
        btn6.setForeground(Color.black);
        btn7.setForeground(Color.black);
        btn8.setForeground(Color.black);
        btn9.setForeground(Color.black);
        OldValue.setForeground(Color.black);
        op.setForeground(Color.black);
        newvalue.setForeground(Color.black);
        
        
        
        ////////////////////////////////////////////////////////////////////
        
        btn1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(newvalue.getText()=="0"){
                newvalue.setText("");
                }
                newvalue.setText(newvalue.getText()+"1");
                
            }
        });
        
        btn2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if("0".equals(newvalue.getText())){
                newvalue.setText("");
                }
                newvalue.setText(newvalue.getText()+"2");
            }
        });
        
        btn3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if("0".equals(newvalue.getText())){
                newvalue.setText("");
                }
                newvalue.setText(newvalue.getText()+"3");
            }
        });
        
        btn4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if("0".equals(newvalue.getText())){
                newvalue.setText("");
                }
                newvalue.setText(newvalue.getText()+"4");
            }
        });
        
        btn5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if("0".equals(newvalue.getText())){
                newvalue.setText("");
                }
                newvalue.setText(newvalue.getText()+"5");
            }
        });
        
        btn6.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if("0".equals(newvalue.getText())){
                newvalue.setText("");
                }
                newvalue.setText(newvalue.getText()+"6");
            }
        });
        
        btn7.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if("0".equals(newvalue.getText())){
                newvalue.setText("");
                }
                newvalue.setText(newvalue.getText()+"7");
            }
        });
        
        btn8.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if("0".equals(newvalue.getText())){
                newvalue.setText("");
                }
                newvalue.setText(newvalue.getText()+"8");
            }
        });
        
        btn9.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if("0".equals(newvalue.getText())){
                newvalue.setText("");
                }
                newvalue.setText(newvalue.getText()+"9");
            }
        });
        
        btn0.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if("0".equals(newvalue.getText())){
                newvalue.setText("");
                }
                newvalue.setText(newvalue.getText()+"0");
            }
        });
        
        btndot.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if("0".equals(newvalue.getText())){
                newvalue.setText("");
                }
                newvalue.setText(newvalue.getText()+".");
            }
        });
        
        
        btnclear.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                OldValue.setText("");
                op.setText("");
                newvalue.setText("");
                if(newvalue.getText().isEmpty()){
             newvalue.setText("0");
             }
            }
        });
        
        btnremove.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
             try{
             newvalue.setText(newvalue.getText().substring(0,newvalue.getText().length()-1));
             
             }catch(Exception ex){}
             if(newvalue.getText().isEmpty()){
             newvalue.setText("0");
             }
            }
        });
        
        btnsign.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if("0".equals(newvalue.getText())){
                newvalue.setText("");
                }
                int num = Integer.parseInt(newvalue.getText());
                num *= -1;
                newvalue.setText(String.valueOf(num));
                
            }
        });
        
       btnplus.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent e) {
        if(OldValue.getText().isEmpty()){
            OldValue.setText(newvalue.getText());
            op.setText("+");
            newvalue.setText("0");
        } else {
            try {
                
                double result = calc(Double.parseDouble(OldValue.getText()), 
                                     op.getText().charAt(0), 
                                     Double.parseDouble(newvalue.getText()));
                
              
                OldValue.setText(String.valueOf(result));
                
              
                newvalue.setText("0");
                op.setText("+");

            } catch(NumberFormatException ex) {
            }
        }
        
      
        if("0".equals(newvalue.getText())) {
            newvalue.setText("");
        }
    }
});
       
       
       btnmin.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent e) {
        if(OldValue.getText().isEmpty()){
            OldValue.setText(newvalue.getText());
            op.setText("-");
            newvalue.setText("0");
        } else {
            try {
                
                double result = calc(Double.parseDouble(OldValue.getText()), 
                                     op.getText().charAt(0), 
                                     Double.parseDouble(newvalue.getText()));
                
              
                OldValue.setText(String.valueOf(result));
                
              
                newvalue.setText("0");
                op.setText("-");

            } catch(NumberFormatException ex) {
            }
        }
        
      
        if("0".equals(newvalue.getText())) {
            newvalue.setText("");
        }
    }
});
       btnmult.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent e) {
        if(OldValue.getText().isEmpty()){
            OldValue.setText(newvalue.getText());
            op.setText("*");
            newvalue.setText("0");
        } else {
            try {
                
                double result = calc(Double.parseDouble(OldValue.getText()), 
                                     op.getText().charAt(0), 
                                     Double.parseDouble(newvalue.getText()));
                
              
                OldValue.setText(String.valueOf(result));
                
              
                newvalue.setText("0");
                op.setText("*");

            } catch(NumberFormatException ex) {
            }
        }
        
      
        if("0".equals(newvalue.getText())) {
            newvalue.setText("");
        }
    }
});
       btndiv.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent e) {
        if(OldValue.getText().isEmpty()){
            OldValue.setText(newvalue.getText());
            op.setText("/");
            newvalue.setText("0");
        } else {
            try {
                
                double result = calc(Double.parseDouble(OldValue.getText()), 
                                     op.getText().charAt(0), 
                                     Double.parseDouble(newvalue.getText()));
                
              
                OldValue.setText(String.valueOf(result));
                
              
                newvalue.setText("0");
                op.setText("/");

            } catch(NumberFormatException ex) {
            }
        }
        
      
        if("0".equals(newvalue.getText())) {
            newvalue.setText("");
        }
    }
});
       btnequal.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent e) {
        if(!OldValue.getText().isEmpty())
        {
            try
            {
                double result = calc(Double.parseDouble(OldValue.getText()), 
                                     op.getText().charAt(0), 
                                     Double.parseDouble(newvalue.getText()));
                                     newvalue.setText(String.valueOf(result));
                                     OldValue.setText("");
                                     op.setText("");
            
            
            }catch(Exception ex ){}
            
        } 
        
      
        
    }
});
       
       
       btnDarkMode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
               
               if(!isDarkmode){
                       
                    
                    frame.getContentPane().setBackground(Color.black);
                    OldValue.setBackground(Color.black);
                    OldValue.setOpaque(true);
                    op.setBackground(Color.black);
                    op.setOpaque(true);
                    newvalue.setBackground(Color.black);
                    newvalue.setOpaque(true);
                    
                    
                    btnequal.setBackground(Color.orange);
                    btnDarkMode.setBackground(Color.WHITE);
                    btnplus.setBackground(new Color(255, 140, 0));
                    btnmin.setBackground(new Color(255, 140, 0));
                    btnmult.setBackground(new Color(255, 140, 0));
                    btnremove.setBackground(Color.lightGray);
                    btnclear.setBackground(Color.LIGHT_GRAY);
                    btnsign.setBackground(Color.lightGray);
                    btndiv.setBackground(new Color(255, 140, 0));
                    btn0.setBackground(Color.GRAY);
                    btn1.setBackground(Color.GRAY);
                    btn2.setBackground(Color.GRAY);
                    btn3.setBackground(Color.GRAY);
                    btn4.setBackground(Color.GRAY);
                    btn5.setBackground(Color.GRAY);
                    btn6.setBackground(Color.GRAY);
                    btn7.setBackground(Color.GRAY);
                    btn8.setBackground(Color.GRAY);
                    btn9.setBackground(Color.GRAY);
                    btndot.setBackground(Color.GRAY);
                    
                    btndot.setForeground(Color.WHITE);
                    btnDarkMode.setForeground(Color.black);
                    btnequal.setForeground(Color.WHITE);
                    btnplus.setForeground(Color.WHITE);
                    btnmin.setForeground(Color.WHITE);
                    btnmult.setForeground(Color.WHITE);
                    btnremove.setForeground(Color.black);
                    btnclear.setForeground(Color.black);
                    btnsign.setForeground(Color.black);
                    btndiv.setForeground(Color.WHITE);
                    btn0.setForeground(Color.WHITE);
                    btn1.setForeground(Color.WHITE);
                    btn2.setForeground(Color.WHITE);
                    btn3.setForeground(Color.WHITE);
                    btn4.setForeground(Color.WHITE);
                    btn5.setForeground(Color.WHITE);
                    btn6.setForeground(Color.WHITE);
                    btn7.setForeground(Color.WHITE);
                    btn8.setForeground(Color.WHITE);
                    btn9.setForeground(Color.WHITE);
                    OldValue.setForeground(Color.WHITE);
                    op.setForeground(Color.WHITE);
                    newvalue.setForeground(Color.WHITE);
                    
                    btnDarkMode.setText("^-^");
                    isDarkmode=true;
                    
                    
                    
                }else{
        frame.getContentPane().setBackground(Color.WHITE);
        OldValue.setBackground(Color.white);
        OldValue.setOpaque(true);
        op.setBackground(Color.white);
        op.setOpaque(true);
        newvalue.setBackground(Color.white);
        newvalue.setOpaque(true);
        btnequal.setBackground(Color.WHITE);
        btnDarkMode.setBackground(Color.gray);
        btnplus.setBackground(new Color(230, 230, 230));
        btnmin.setBackground(new Color(230, 230, 230));
        btnmult.setBackground(new Color(230, 230, 230));
        btnremove.setBackground(new Color(230, 230, 230));
        btnclear.setBackground(new Color(230, 230, 230));
        btnsign.setBackground(new Color(230, 230, 230));
        btndiv.setBackground(new Color(230, 230, 230));
        btn0.setBackground(Color.white);
        btn1.setBackground(Color.white);
        btn2.setBackground(Color.white);
        btn3.setBackground(Color.white);
        btn4.setBackground(Color.white);
        btn5.setBackground(Color.white);
        btn6.setBackground(Color.white);
        btn7.setBackground(Color.white);
        btn8.setBackground(Color.white);
        btn9.setBackground(Color.white);
        btndot.setBackground(Color.white);
        
        ////////////////////////////////////////////////////////////////////
        
        btndot.setForeground(Color.black);
        btnDarkMode.setForeground(Color.WHITE);
        btnequal.setForeground(Color.black);
        btnplus.setForeground(Color.black);
        btnmin.setForeground(Color.black);
        btnmult.setForeground(Color.black);
        btnremove.setForeground(Color.black);
        btnclear.setForeground(Color.black);
        btnsign.setForeground(Color.black);
        btndiv.setForeground(Color.black);
        btn0.setForeground(Color.black);
        btn1.setForeground(Color.black);
        btn2.setForeground(Color.black);
        btn3.setForeground(Color.black);
        btn4.setForeground(Color.black);
        btn5.setForeground(Color.black);
        btn6.setForeground(Color.black);
        btn7.setForeground(Color.black);
        btn8.setForeground(Color.black);
        btn9.setForeground(Color.black);
        OldValue.setForeground(Color.black);
        op.setForeground(Color.black);
        newvalue.setForeground(Color.black);
               btnDarkMode.setText("Dark");
               isDarkmode=false;
               
               
               
               
               }
                
                }
        });
       

        
        
        //////////////////////////////////////////////////////////////////////
        
        frame.add(OldValue);
        frame.add(op);
        frame.add(newvalue);
        frame.add(btn0);
        frame.add(btndot);
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.add(btn5);
        frame.add(btn6);
        frame.add(btn7);
        frame.add(btn8);
        frame.add(btn9);
        frame.add(btnplus);
        frame.add(btnmult);
        frame.add(btnmin);
        frame.add(btndiv);
        frame.add(btnclear);
        frame.add(btnsign);
        frame.add(btnremove);
        frame.add(btnequal);
        frame.add(btnDarkMode);
    }
    
public static double calc (double num1 , char c , double num2 ){
    double result=0;
        switch (c) {
            case '+' -> result = num1+num2;
                case '-' -> result = num1-num2;
                case '*' -> result =num1*num2;
                case '/' -> {
                    result = num1/num2;
                    if(num2!=0){
                        result=num1/num2;
                        
                    }
                    else {
                        
                        JOptionPane.showConfirmDialog(null, "Can not Divided by Zero");
                    }
            }
                default -> {
            }
        }
    return result;
}}

       
      
