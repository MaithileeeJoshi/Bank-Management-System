package bank.managment.system;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener {

    JDateChooser dateChooser;
    
    long random;
    JTextField nameTextField, fnameTextField,dobTextField,enameTextField,addnameTextField,cnameTextField,snameTextField,pnameTextField;
    JButton next;
    JRadioButton male,female,other,married,unmarried;

    SignupOne() {
        setLayout(null);

        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);

        JLabel formno = new JLabel("APPLICATION FORM NO." + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);

        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetails.setBounds(290, 80, 400, 30);
        add(personalDetails);

        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);

        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);

        JLabel Fathername = new JLabel("Father's Name:");
        Fathername.setFont(new Font("Raleway", Font.BOLD, 20));
        Fathername.setBounds(100, 190, 200, 30);
        add(Fathername);

        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        fnameTextField.setBounds(300, 190, 400, 30);
        add(fnameTextField);

        JLabel dob = new JLabel("Date Of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);

        dateChooser  = new JDateChooser();
        dateChooser.setBounds(300, 240, 400, 30);
        dateChooser.setForeground(new Color(105, 105, 105));
        add(dateChooser);

        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.WHITE);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(450, 290, 120, 30);
        female.setBackground(Color.WHITE);
        add(female);

        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);

        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 340, 200, 30);
        add(email);

        enameTextField = new JTextField();
        enameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        enameTextField.setBounds(300, 340, 400, 30);
        add(enameTextField);

        JLabel status = new JLabel("Marital Status:");
        status.setFont(new Font("Raleway", Font.BOLD, 20));
        status.setBounds(100, 390, 200, 30);
        add(status);

        married = new JRadioButton("Married");
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.WHITE);
        add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450, 390, 100, 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);

        other = new JRadioButton("Other");
        other.setBounds(630, 390, 100, 30);
        other.setBackground(Color.WHITE);
        add(other);

        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(other);

        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        add(address);

        addnameTextField = new JTextField();
        addnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        addnameTextField.setBounds(300, 440, 400, 30);
        add(addnameTextField);

        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);

        cnameTextField = new JTextField();
        cnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        cnameTextField.setBounds(300, 490, 400, 30);
        add(cnameTextField);

        JLabel pincode = new JLabel("Pin-code");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 540, 200, 30);
        add(pincode);

        pnameTextField = new JTextField();
        pnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        pnameTextField.setBounds(300, 540, 400, 30);
        add(pnameTextField);

        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 590, 200, 30);
        add(state);

        snameTextField = new JTextField();
        snameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        snameTextField.setBounds(300, 590, 400, 30);
        add(snameTextField);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }

    
    @Override
    public void actionPerformed(ActionEvent ae){
        String formno=""+random; //long
        String name=nameTextField.getText();//setText
        String fname=fnameTextField.getText();
        String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(male.isSelected()){
            gender="Male";
        }else if(female.isSelected()){
            gender="Female";
        }
        String email=enameTextField.getText();
        String marital=null;
        if(married.isSelected()){
            marital="Married";
        }else if(unmarried.isSelected()){
            marital="Unmarried";
        }else if(other.isSelected()){
            marital="Other";
        }
        
        String address=addnameTextField.getText();
        String city=cnameTextField.getText();
        String state=snameTextField.getText();
        String pincode=pnameTextField.getText();
        
        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null,"Name is required" );
            }else{
                Conn c=new Conn();
                String query="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pincode+"')";
                c.s.executeUpdate(query);
                SignupTwo signupTwo = new SignupTwo(formno);
            signupTwo.setVisible(true);
            
            setVisible(false);
            }
            
            /*else if(fname.equals("")){
                JOptionPane.showMessageDialog(null,"Father's Name is required" );
            }else if(dob.equals("")){
                JOptionPane.showMessageDialog(null,"Date Of Birth is required" );
            }else if(gender.equals("")){
                JOptionPane.showMessageDialog(null,"Father's Name is required" );
            }else if(fname.equals("")){
                JOptionPane.showMessageDialog(null,"Father's Name is required" );
            }*/
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void main(String args[]) {
        new SignupOne();
    }
}
