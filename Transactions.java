
package bank.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transactions extends JFrame implements ActionListener {
    
    JButton deposit,withdrawl,fastcash,ministatement,pinchange, balanceenquiry,services,exit;
    String pinnumber;
    
    Transactions(String pinnumber){
        
        this.pinnumber=pinnumber;
        
        
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/m.jpg"));
        Image i2=i1.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,1000,700);
        add(image);
        
        JLabel text=new JLabel("Please Select Your Transaction");
        text.setBounds(250,250,600,50);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway", Font.LAYOUT_NO_LIMIT_CONTEXT, 18));
        image.add(text);
        
        deposit=new JButton("Deposit");
        deposit.setBounds(170,347,140,27);
        deposit.addActionListener(this);
        image.add(deposit);
        
        withdrawl=new JButton("Cash Withdrawl");
        withdrawl.setBounds(425,347,140,27);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        fastcash=new JButton("Fast Cash");
        fastcash.setBounds(170,377,140,27);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
        ministatement=new JButton("Mni Statement");
        ministatement.setBounds(425,377,140,27);
        ministatement.addActionListener(this);
        image.add(ministatement);
        
        pinchange=new JButton("Pin Change");
        pinchange.setBounds(170,407,140,27);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
        balanceenquiry=new JButton("Balane Enquiry");
        balanceenquiry.setBounds(425,407,140,27);
        balanceenquiry.addActionListener(this);
        image.add(balanceenquiry);
        
        services=new JButton("Services");
        services.setBounds(170,437,140,27);
        services.addActionListener(this);
        image.add(services);
        
        exit=new JButton("Exit");
        exit.setBounds(425,437,140,27);
        exit.addActionListener(this);
        image.add(exit);
        
        //JButton mdeposit=new JButton("Deposit");
        //deposit.setBounds(170,347,140,27);
       // image.add(mdeposit);
        
        
        
        
       setSize(900,900);
       setLocation(300,0);
       setUndecorated(true);
       setVisible(true);
       
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==exit){
            System.exit(0);
        }else if(ae.getSource()==deposit){
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        }else if(ae.getSource()==withdrawl){
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        }else if(ae.getSource()==fastcash){
            setVisible(false);
            new FastCash(pinnumber).setVisible(true);
        }  
    }
    
    public static void main(String args[]){
        new Transactions("");
    }
}
