
package bank.managment.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;



public class FastCash extends JFrame implements ActionListener {
    


    
    JButton deposit,withdrawl,fastcash,ministatement,pinchange, balanceenquiry,exit;
    String pinnumber;
    
    FastCash(String pinnumber){
        
        this.pinnumber=pinnumber;
        
        
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/m.jpg"));
        Image i2=i1.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,1000,700);
        add(image);
        
        JLabel text=new JLabel("SELECT WITHDRAWL AMOUNT");
        text.setBounds(250,250,600,50);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway", Font.LAYOUT_NO_LIMIT_CONTEXT, 18));
        image.add(text);
        
        deposit=new JButton("RS 100");
        deposit.setBounds(170,347,140,27);
        deposit.addActionListener(this);
        image.add(deposit);
        
        withdrawl=new JButton("RS 500");
        withdrawl.setBounds(425,347,140,27);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        fastcash=new JButton("RS 1000");
        fastcash.setBounds(170,377,140,27);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
        ministatement=new JButton("RS 2000");
        ministatement.setBounds(425,377,140,27);
        ministatement.addActionListener(this);
        image.add(ministatement);
        
        pinchange=new JButton("RS 5000");
        pinchange.setBounds(170,407,140,27);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
        balanceenquiry=new JButton("RS 10,000");
        balanceenquiry.setBounds(425,407,140,27);
        balanceenquiry.addActionListener(this);
        image.add(balanceenquiry);
        
        
        exit=new JButton("Back");
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
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }else  {
            String amount=((JButton)ae.getSource()).getText().substring(3);//500
            Conn c=new Conn();
            try{
                ResultSet rs=c.s.executeQuery("select * from bank where pin= '"+pinnumber+"'");
                int balance=0;
                while(rs.next()) //rs.next is used to loop rows one by one
                {
                    if(rs.getString("type").equals("Deposit")){
                        balance +=Integer.parseInt(rs.getString("amount"));
                    }else {
                        balance -=Integer.parseInt(rs.getString("amount"));
                    }
                }
                
                if(ae.getSource()!=exit && balance<Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"Insufficieant Balance ");
                    return; //if balance is not sufficient this return command will return it back
                    
                }
                
                Date date =new Date();
                String query="insert into bank values('"+pinnumber+"','"+date+"','Withdrawl','"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Rs "+amount+"Debited Successfully" );
                
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
                
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
    
    public static void main(String args[]){
        new FastCash("");
    }
}


